package toys;

import tuytypes.BaseMaterial;
import tuytypes.ToyTypes;

public class Transformer extends Toy{
    private int amountOfShapes;
    private boolean hasBatteries;

    /*Default constructor
            * */
    public Transformer(){}

    /*Constructor initialized all fields
        * */
    public Transformer(BaseMaterial material, int minAge, String originCountry, String concernName, int amountOfShapes, boolean hasBatteries){
        super(ToyTypes.TRANSFORMER, material, minAge, originCountry, concernName);
        setAmountOfShapes(amountOfShapes);
        this.hasBatteries=hasBatteries;
    }

    /*Constructor for factory pattern method
    * */
    public Transformer(BaseMaterial material, int minAge, String originCountry, String concernName){
        super(ToyTypes.TRANSFORMER, material, minAge, originCountry, concernName);
    }

    public int getAmountOfShapes() {
        return amountOfShapes;
    }

    public void setAmountOfShapes(int amountOfShapes) {
        if(amountOfShapes>0&&amountOfShapes<6) {
            this.amountOfShapes = amountOfShapes;
        }
        else {
            System.out.println("Amount of shapes value is incorrect. Setting to default value(3)");//replace with exception and logger
            this.amountOfShapes=3;
        }
    }

    public boolean isHasBatteries() {
        return hasBatteries;
    }

    public void setHasBatteries(boolean hasBatteries) {
        this.hasBatteries = hasBatteries;
    }

}
