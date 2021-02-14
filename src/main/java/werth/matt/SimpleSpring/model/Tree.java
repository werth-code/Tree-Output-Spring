package werth.matt.SimpleSpring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

//https://trefle.io/api/v1/plants?token=zbv6y3dV6flhDRn_vEuF41-gpYxrtYb6Za-1BaGq4nA&filter%5Bcommon_name%5D=apple
//// TODO: 2/7/21 We may want to make this an abstract class and have tree types extend.

@Entity //marks this as a JPA entity. creates a table for us..
public class Tree {
    @Id // marks this as the primary key of the database..
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String location; //Correct: 41.40338, 2.17403.
    private TreeType treeType;
    private LocalDate datePlanted;
    private Boolean requiresCrossPollination;
    private Double yearlyMaintenanceCost;

    // private Integer rangeOfCrossPollinator;
    // private Integer productionAge;
    // private Double initialCost;
    // private Double costPerPound;

    public Tree(){};

    public Tree(String location, TreeType treeType, LocalDate datePlanted, Boolean requiresPollination) {
        this.location = location;
        this.treeType = treeType;
        this.datePlanted = datePlanted;
        this.requiresCrossPollination = requiresPollination;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Double getYearlyMaintenanceCost() {
        return yearlyMaintenanceCost;
    }

    public void setYearlyMaintenanceCost(Double yearlyMaintenanceCost) {
        this.yearlyMaintenanceCost = yearlyMaintenanceCost;
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
