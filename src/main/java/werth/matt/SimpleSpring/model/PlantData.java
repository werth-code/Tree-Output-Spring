package werth.matt.SimpleSpring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties
public class PlantData {
    @Id
    private Long id;
    private String common_name;
    private String scientific_name;
    private String family_common_name;
    private Integer genus_id;
    private String image_url;
    private String genus;
    private String family;

    PlantData(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommon_name() {
        return common_name;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public String getScientific_name() {
        return scientific_name;
    }

    public void setScientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }

    public String getFamily_common_name() {
        return family_common_name;
    }

    public void setFamily_common_name(String family_common_name) {
        this.family_common_name = family_common_name;
    }

    public Integer getGenus_id() {
        return genus_id;
    }

    public void setGenus_id(Integer genus_id) {
        this.genus_id = genus_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }


    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "PlantData{" +
                "id=" + id +
                ", common_name='" + common_name + '\'' +
                ", scientific_name='" + scientific_name + '\'' +
                ", family_common_name='" + family_common_name + '\'' +
                ", genus_id=" + genus_id +
                ", image_url='" + image_url + '\'' +
                ", genus='" + genus + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}


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