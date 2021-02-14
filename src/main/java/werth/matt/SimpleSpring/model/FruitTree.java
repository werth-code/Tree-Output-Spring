package werth.matt.SimpleSpring.model;
import java.time.LocalDate;

public class FruitTree extends Tree {

    public FruitTree() {
    }

    public FruitTree(String location, TreeType treeType, LocalDate treeAge, Boolean requiresPollination) {
        super(location, treeType, treeAge, requiresPollination);
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
