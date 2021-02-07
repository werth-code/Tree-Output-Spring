package werth.matt.SimpleSpring.model;

import java.time.LocalDate;
import java.util.UUID;



//// TODO: 2/7/21 We may want to make this an abstract class and have tree types extend.

public class Tree {
    private String id;
    private String location;
    private TreeType treeType;
    private LocalDate datePlanted;
    private Boolean requiresCrossPollination;
    // private Integer rangeOfCrossPollinator;
    // private Integer productionAge;
    // private Double initialCost;
    // private Double costPerPound;

    public Tree(){};

    public Tree(String location, TreeType treeType, LocalDate datePlanted, Boolean requiresPollination) {
        this.id = UUID.randomUUID().toString();
        this.location = location;
        this.treeType = treeType;
        this.datePlanted = datePlanted;
        this.requiresCrossPollination = requiresPollination;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public LocalDate getDatePlanted() {
        return datePlanted;
    }

    public void setDatePlanted(LocalDate datePlanted) {
        this.datePlanted = datePlanted;
    }

    public Boolean getRequiresCrossPollination() {
        return requiresCrossPollination;
    }

    public void setRequiresCrossPollination(Boolean requiresCrossPollination) {
        this.requiresCrossPollination = requiresCrossPollination;
    }

    @Override
    public String toString() {
        return "Tree {" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", treeType=" + treeType +
                '}';
    }
}
