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

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/search")
public class PlantResources {

    private static final Logger logger = LoggerFactory.getLogger(PlantResources.class);

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{searchTerm}")
    public PlantData[] getPlantInfo(@PathVariable String searchTerm) {

        String url =  "https://trefle.io/api/v1/plants/search?token=" + apiKey + "&q=" + searchTerm;
        ResponseEntity<PlantDataRequest> plantEntity = restTemplate.getForEntity(url, PlantDataRequest.class);

        PlantData[] plantData = plantEntity.getBody().getData();

        if(plantData.length > 0) return Arrays.copyOfRange(plantData, 0, 5); //limit to first 5 results..
        else return new PlantData[0];
    }

    @CrossOrigin
    @GetMapping("type/{commonName}") //search/type/male&20fern
    public PlantData getIndividualPlantInfo(@PathVariable String commonName) throws UnsupportedEncodingException {

        commonName = encodeValue(commonName);

                     //https://trefle.io/api/v1/plants?token=zbv6y3dV6flhDRn_vEuF41-gpYxrtYb6Za-1BaGq4nA&filter%5Bcommon_name%5D=beach%20strawberry
        String url =  "https://trefle.io/api/v1/plants?token=" + apiKey + "&filter[common_name]=" + commonName;
        ResponseEntity<PlantDataRequest> plantEntity = restTemplate.getForEntity(url, PlantDataRequest.class);

        PlantData[] plantData = plantEntity.getBody().getData();

        if(plantData[0] != null) return plantData[0];
        else return new PlantData();
    }

    private String encodeValue(String value) throws UnsupportedEncodingException {
        return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
    }

}