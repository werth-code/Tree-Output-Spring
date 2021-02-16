package werth.matt.SimpleSpring.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import werth.matt.SimpleSpring.model.Plant;
import werth.matt.SimpleSpring.model.PlantData;
import werth.matt.SimpleSpring.model.PlantDataRequest;
import werth.matt.SimpleSpring.service.PlantService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/search")
public class PlantResources {

    private static final Logger logger = LoggerFactory.getLogger(PlantResources.class);

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

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



// String name, String location, String plantType, LocalDate datePlanted

//search string
//https://trefle.io/api/v1/plants?token=zbv6y3dV6flhDRn_vEuF41-gpYxrtYb6Za-1BaGq4nA&filter%5Bcommon_name%5D=fern

//data returned
//{"data":[{
// "id":373128,
// "common_name":"Fern",
// "slug":"pteris-dentata",
// "scientific_name":"Pteris dentata",
// "year":1775,
// "bibliography":"Fl. Aegypt.-Arab.: CXXIV, 186 (1775)",
// "author":"Forssk.",
// "status":"accepted",
// "rank":"species",
// "family_common_name":"Maidenhair Fern family",
// "genus_id":5716,
// "image_url":"https://bs.floristic.org/image/o/3e2d26bf0ca828f583e89a3bbeb32c816aa8bb3c",
// "synonyms":["Pteris semiserrata","Asplenium adscensionis","Pteris cordemoyi","Pteris flaccida","Pteris straminea","Lonchitis adscensionis","Pteris adscensionis","Pteris serrulata","Pteris oligodyctyon"],
// "genus":"Pteris",
// "family":"Pteridaceae",
// "links":{"self":"/api/v1/species/pteris-dentata","plant":"/api/v1/plants/pteris-dentata","genus":"/api/v1/genus/pteris"}}],
// "links":{"self":"/api/v1/plants?filter%5Bcommon_name%5D=fern","first":"/api/v1/plants?filter%5Bcommon_name%5D=fern\u0026page=1","last":"/api/v1/plants?filter%5Bcommon_name%5D=fern\u0026page=1"},
// "meta":{"total":1}}