package werth.matt.SimpleSpring.model;

import werth.matt.SimpleSpring.model.weather.TreeHealth;
import werth.matt.SimpleSpring.model.zones.PlantingZone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;


//// TODO: 2/7/21 We may want to make this an abstract class and have tree types extend.

@Entity //marks this as a JPA entity. creates a table for us..
public class Tree {
    @Id // marks this as the primary key of the database..
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String location; //Correct: 41.40338, 2.17403.
    private PlantingZone plantingZone; // auto look-up based on gps location of tree.
    private TreeType treeType;
    private LocalDate datePlanted;
    private Boolean requiresCrossPollination;
    private Double yearlyMaintenanceCost;
    private TreeHealth treeHealth;

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
        this.treeHealth = TreeHealth.HEALTHY;
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

    public TreeHealth getTreeHealth() {
        return treeHealth;
    }

    public void setTreeHealth(TreeHealth treeHealth) {
        this.treeHealth = treeHealth;
    }

    public PlantingZone getPlantingZone() {
        return plantingZone;
    }

    public void setPlantingZone(PlantingZone plantingZone) {
        this.plantingZone = plantingZone;
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
