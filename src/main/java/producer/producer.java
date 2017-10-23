package producer;

import toys.Toy;
import toysfactories.toymaterialfactory.ToyFactory;
import tuytypes.BaseMaterial;
import tuytypes.ToyTypes;

import java.util.ArrayList;
import java.util.List;

public class producer {

    public static void main(String[] args) {
       List<Toy> toys = new ArrayList<Toy>();
       toys.add(ToyFactory.chooseToyMaterial(ToyTypes.TRANSFORMER, BaseMaterial.METAL, 5, "China", "Lego"));
       toys.add(ToyFactory.chooseToyMaterial(ToyTypes.CUDDLYTOY, BaseMaterial.TEXTILE, 5, "China", "Lego"));
       toys.add(ToyFactory.chooseToyMaterial(ToyTypes.DOLL, BaseMaterial.PLASTIC, 5, "China", "Lego"));
       toys.add(ToyFactory.chooseToyMaterial(ToyTypes.BALL, BaseMaterial.LEATHER, 5, "China", "Lego"));
    }
}
