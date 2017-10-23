package toys;

import tuytypes.BaseMaterial;
import tuytypes.ToyTypes;

public class CuddlyToy extends Toy{
    private boolean hasRingtone;
    private String name;

    /*Default constructor
                * */
    public CuddlyToy (){}

    /*Constructor initialized all fields
            * */
    public CuddlyToy(BaseMaterial material, int minAge, String originCountry, String concernName, boolean hasRingtone, String name){
        super(ToyTypes.CUDDLYTOY, material, minAge, originCountry, concernName);
        this.hasRingtone=hasRingtone;
        this.name=name;

    }

    /*Constructor for factory pattern method
    * */
    public CuddlyToy(BaseMaterial material, int minAge, String originCountry, String concernName){
        super(ToyTypes.CUDDLYTOY, material, minAge, originCountry, concernName);
    }

    public boolean isHasRingtone() {
        return hasRingtone;
    }

    public void setHasRingtone(boolean hasRingtone) {
        this.hasRingtone = hasRingtone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
