package toys;

import tuytypes.BaseMaterial;
import tuytypes.ToyTypes;

public class Ball extends Toy {
    private int size;
    /*Default constructor
        * */
    public Ball(){}

    /*Constructor initialized all fields
    * */
    public Ball(BaseMaterial material, int minAge, String originCountry, String concernName, int size){
        super(ToyTypes.BALL, material, minAge, originCountry, concernName);
        setSize(size);
    }

    /*Constructor for factory pattern method
    * */
    public Ball(BaseMaterial material, int minAge, String originCountry, String concernName){
        super(ToyTypes.BALL, material, minAge, originCountry, concernName);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size>2&&size<10) {
            this.size = size;
        }
        else{

            System.out.println("Size is not valid. Setting size to default value(5)");//replace with exception and logger
            this.size=5;
        }
    }

}
