package toysfactories.toymaterialfactory;

import toys.*;
import toysfactories.toytypefactory.*;
import tuytypes.BaseMaterial;
import tuytypes.ToyTypes;



public class ToyFactory {

        public static Toy chooseToyMaterial(ToyTypes toyType, BaseMaterial material, int minAge, String originCountry, String concernName){
        Toy toy=null;
        switch(material){
            case TEXTILE:
                toy =  TextileToyFactory.chooseType(toyType, minAge, originCountry, concernName);
                break;
            case LEATHER:
                toy =  LeatherToyFactory.chooseType(toyType, minAge, originCountry, concernName);
                break;

            case METAL:
                toy =  MetalToyFactory.chooseType(toyType, minAge, originCountry, concernName);
                break;

            case PLASTIC:
                toy =  PlasticToyFactory.chooseType(toyType, minAge, originCountry, concernName);
                break;

            case RUBBER:
                toy =  RubberToyFactory.chooseType(toyType, minAge, originCountry, concernName);
                break;
        }
        return toy;
    }
}
