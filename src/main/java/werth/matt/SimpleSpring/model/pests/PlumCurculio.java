package werth.matt.SimpleSpring.model.pests;

import werth.matt.SimpleSpring.model.pests.interfaces.PestMethods;

import java.time.LocalDate;

public class PlumCurculio extends Pest implements PestMethods {
    public static InfestationRate infestationRate = InfestationRate.LOW;

    public PlumCurculio(Integer levelOfInfestation, LocalDate dateOfInfestation) {
        super(levelOfInfestation, dateOfInfestation);
    }

    @Override
    public Integer poundOfDamagePerDay() {
        return null;
    }

    @Override
    public Integer calculatePoundsOfDamage() {
        return null;
    }

    @Override
    public Double costOfTreatment() {
        return null;
    }
}
