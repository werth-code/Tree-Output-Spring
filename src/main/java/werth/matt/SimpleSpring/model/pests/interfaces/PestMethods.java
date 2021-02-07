package werth.matt.SimpleSpring.model.pests.interfaces;

public interface PestMethods {
    Integer poundOfConsumptionPerDay(); // how much damage is cause each day by this infestation
    Integer calculatePoundsOfDamage(); //  (level of infestation) * (days * consumptionOfPest per day)
    Double costOfTreatment(); // level of infestation * cost of treating...
}
