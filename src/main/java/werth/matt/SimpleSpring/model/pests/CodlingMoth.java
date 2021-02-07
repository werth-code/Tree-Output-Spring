package werth.matt.SimpleSpring.model.pests;

import werth.matt.SimpleSpring.model.pests.interfaces.PestMethods;

import java.time.LocalDate;

public class CodlingMoth extends Pest implements PestMethods {
    public static InfestationRate infestationRate = InfestationRate.MED;

    public CodlingMoth(Integer levelOfInfestation, LocalDate dateOfInfestation) {
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
