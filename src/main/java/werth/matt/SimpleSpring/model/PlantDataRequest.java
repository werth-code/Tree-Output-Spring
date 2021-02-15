package werth.matt.SimpleSpring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class PlantDataRequest {
    private PlantData[] data;

    public PlantData[] getData() {
        return data;
    }

    public void setData(PlantData[] data) {
        this.data = data;
    }
}
