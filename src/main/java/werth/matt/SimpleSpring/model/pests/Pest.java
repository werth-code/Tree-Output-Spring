package werth.matt.SimpleSpring.model.pests;

import java.time.LocalDate;

abstract public class Pest {
    private Integer levelOfInfestation;
    private Double costOfTreatment;
    private Integer poundsOfDamage;
    private LocalDate dateOfInfestation;

    public Pest(Integer levelOfInfestation, LocalDate dateOfInfestation) {
        this.dateOfInfestation = dateOfInfestation;
        this.levelOfInfestation = levelOfInfestation;
    }

    public Integer getPoundsOfDamage() {
        return poundsOfDamage;
    }

    public void setPoundsOfDamage(Integer poundsOfDamage) {
        this.poundsOfDamage = poundsOfDamage;
    }

    public Integer getLevelOfInfestation() {
        return levelOfInfestation;
    }

    public void setLevelOfInfestation(Integer levelOfInfestation) {
        this.levelOfInfestation = levelOfInfestation;
    }
}
