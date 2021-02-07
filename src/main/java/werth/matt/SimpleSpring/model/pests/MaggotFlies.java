package werth.matt.SimpleSpring.model.pests;

import java.time.LocalDate;

public class MaggotFlies extends Pest{

    public MaggotFlies(Integer levelOfInfestation, LocalDate dateOfInfestation) {
        super(levelOfInfestation, dateOfInfestation);
    }
}
