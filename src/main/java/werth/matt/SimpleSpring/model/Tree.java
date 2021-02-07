package werth.matt.SimpleSpring.model;

import java.util.UUID;

public class Tree {
    private String id;
    private String location;
    private TreeType treeType;
    private Integer treeAge;
    private Boolean requiresCrossPollination;

    // private Integer productionAge;
    // private Boolean inRangeOfCrossPollinator;
    // private Double costPerPound;

    public Tree(){};

    public Tree(String location, TreeType treeType, Integer treeAge, Boolean requiresPollination) {
        this.id = UUID.randomUUID().toString();
        this.location = location;
        this.treeType = treeType;
        this.treeAge = treeAge;
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

    public Integer getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(Integer treeAge) {
        this.treeAge = treeAge;
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
