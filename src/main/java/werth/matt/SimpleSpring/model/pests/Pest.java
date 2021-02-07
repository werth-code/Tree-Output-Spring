package werth.matt.SimpleSpring.model.pests;

abstract public class Pest {
    private PestType pestType;
    private Integer levelOfInfestation;
    private Double costOfTreatment;
    private Integer poundsOfDamage;

    public Pest(PestType pestType, Integer levelOfInfestation) {
        this.pestType = pestType;
        this.levelOfInfestation = levelOfInfestation;
    }

    public PestType getPestType() {
        return pestType;
    }

    public void setPestType(PestType pestType) {
        this.pestType = pestType;
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
