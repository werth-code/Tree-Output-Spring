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

//    private String id;
//    private String location;
//    private TreeType treeType;
//    private LocalDate datePlanted;
//    private Boolean requiresCrossPollination;
//    private Double yearlyMaintenanceCost;
//    private TreeHealth treeHealth;

//    // private Integer rangeOfCrossPollinator;
//    // private Integer productionAge;
//    // private Double initialCost;
//    // private Double costPerPound;
