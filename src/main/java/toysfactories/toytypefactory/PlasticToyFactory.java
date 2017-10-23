package toysfactories.toytypefactory;

import toys.*;
import tuytypes.BaseMaterial;
import tuytypes.ToyTypes;

public class PlasticToyFactory {

    public static Toy chooseType(ToyTypes toyType, int minAge, String originCountry, String concernName){
        Toy toy = null;

        switch (toyType){
            case TRANSFORMER:
                toy = new Transformer(BaseMaterial.PLASTIC, minAge, originCountry, concernName);
                break;

            case CUDDLYTOY:
                toy = new CuddlyToy(BaseMaterial.PLASTIC, minAge, originCountry, concernName);
                break;

            case DOLL:
                toy = new Doll(BaseMaterial.PLASTIC, minAge, originCountry, concernName);
                break;

            case BALL:
                toy = new Ball(BaseMaterial.PLASTIC, minAge, originCountry, concernName);
                break;

            default:
                //add some output or create default object
                break;

        }
        return toy;

    }
}
