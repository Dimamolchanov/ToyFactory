package toys;

import tuytypes.BaseMaterial;
import tuytypes.ToyTypes;

public abstract class Toy {
    private ToyTypes toyType;
    private BaseMaterial material;
    private int minAge;
    private String originCountry;
    private String concernName;


    public Toy(){}

    public Toy(ToyTypes toyType, BaseMaterial material, int minAge, String originCountry, String concernName) {
        this.toyType = toyType;
        this.material=material;
        setMinAge(minAge);
        this.originCountry = originCountry;
        this.concernName = concernName;
        System.out.println("Created the toy with type "+getClass().getName());//replace with overrided toString
        System.out.println("Made from "+this.material);
    }




    public ToyTypes getToyType() {
        return toyType;
    }

    public void setToyType(ToyTypes toyType){
        this.toyType=toyType;

    }
    public BaseMaterial getMaterial() {
        return material;
    }

    public void setMaterial (BaseMaterial baseMaterial){
        this.material=material;

    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        if (minAge>0&&minAge<50) {
            this.minAge = minAge;
        }
        else {
            System.out.println("Age is not applicable! Setting minimum age to default value(10 years)");//replace with exception and logger
            this.minAge=10;
        }
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry){
        this.originCountry=originCountry;
    }

    public String getConcernName() {
        return concernName;
    }

    public void setConcernName(String concernName){
        this.concernName=concernName;
    }
}
