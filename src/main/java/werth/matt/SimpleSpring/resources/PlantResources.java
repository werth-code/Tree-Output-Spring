package werth.matt.SimpleSpring.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import werth.matt.SimpleSpring.model.PlantData;
import werth.matt.SimpleSpring.model.PlantDataRequest;

@CrossOrigin
@RestController
@RequestMapping("/search")
public class PlantResources {

    private static final Logger logger = LoggerFactory.getLogger(PlantResources.class);

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @CrossOrigin
    @GetMapping("/{searchTerm}")
    public PlantData[] getPlantInfo(@PathVariable String searchTerm) {

        String url =  "https://trefle.io/api/v1/plants/search?token=" + apiKey + "&q=" + searchTerm;
        ResponseEntity<PlantDataRequest> plantEntity = restTemplate.getForEntity(url, PlantDataRequest.class);

        PlantData[] plantData = plantEntity.getBody().getData();
        logger.info(plantData[0].toString());
        logger.info(url);
        return plantData;
    }

}