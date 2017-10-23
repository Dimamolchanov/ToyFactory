package toys;

import tuytypes.BaseMaterial;
import tuytypes.ToyTypes;

public class Doll extends Toy{
    private String hairStyle;
    private boolean isClothesChangeble;

    /*Default constructor
    * */
    public Doll(){}

    /*Constructor initialized all fields
    * */
    public Doll(BaseMaterial material, int minAge, String originCountry, String concernName, String hairStyle, boolean isClothesChangeble){
        super(ToyTypes.DOLL, material, minAge, originCountry, concernName);
        this.hairStyle=hairStyle;
        this.isClothesChangeble=isClothesChangeble;
    }

    /*Constructor for factory pattern method
    * */

    public Doll(BaseMaterial material, int minAge, String originCountry, String concernName){
        super(ToyTypes.DOLL, material, minAge, originCountry, concernName);
    }



    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public boolean isClothesChangeble() {
        return isClothesChangeble;
    }

    public void setClothesChangeble(boolean clothesChangeble) {
        isClothesChangeble = clothesChangeble;
    }

}
