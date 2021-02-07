package werth.matt.SimpleSpring.model;

import java.util.UUID;

public class Tree {
    private String id;
    private String location;
    private TreeType treeType;
    private Integer treeAge;

    public Tree(String location, TreeType treeType, Integer treeAge) {
        this.id = UUID.randomUUID().toString();
        this.location = location;
        this.treeType = treeType;
        this.treeAge = treeAge;
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

    @Override
    public String toString() {
        return "Tree {" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", treeType=" + treeType +
                '}';
    }
}
