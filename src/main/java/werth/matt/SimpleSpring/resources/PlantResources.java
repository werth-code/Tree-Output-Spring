package werth.matt.SimpleSpring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import werth.matt.SimpleSpring.model.Plant;

@RestController
@RequestMapping("/plantsearch")
public class PlantResources {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{searchTerm}")
    public Plant getPlantInfo(@PathVariable("searchTerm") String searchTerm) {
       Plant plant = restTemplate.getForObject(
                "https://trefle.io/api/v1/plants?token=" + apiKey + "&filter%5Bcommon_name%5D=" + searchTerm,
                Plant.class
        );
        return plant;
    }

}

// String name, String location, String plantType, LocalDate datePlanted

//key
//zbv6y3dV6flhDRn_vEuF41-gpYxrtYb6Za-1BaGq4nA

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