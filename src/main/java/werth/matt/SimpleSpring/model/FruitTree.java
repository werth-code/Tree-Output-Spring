package werth.matt.SimpleSpring.model;

import werth.matt.SimpleSpring.model.interfaces.FruitTreeProduction;

import java.time.LocalDate;

public class FruitTree extends Tree implements FruitTreeProduction {

    public FruitTree() {
    }

    public FruitTree(String location, TreeType treeType, LocalDate treeAge, Boolean requiresPollination) {
        super(location, treeType, treeAge, requiresPollination);
    }

    @Override
    public Integer fruitYield(Tree tree) {
        return null;
    }

    @Override
    public Double costPerPound(Tree tree) {
        return null;
    }
}
