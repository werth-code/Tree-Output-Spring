package werth.matt.SimpleSpring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.hateoas.server.core.SpringAffordanceBuilder;

@JsonIgnoreProperties
public class PlantData {
    private Long id;
    private String commonName;
    private String scientificName;
    private Integer year;
    private String bibliography;
    private String familyCommonName;
    private Integer genusId;
    private String imageUrl;
    private String[] synonyms;
    private String genus;
    private String family;

    PlantData(){}

    PlantData(String commonName) {
        this.commonName = commonName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getBibliography() {
        return bibliography;
    }

    public void setBibliography(String bibliography) {
        this.bibliography = bibliography;
    }

    public String getFamilyCommonName() {
        return familyCommonName;
    }

    public void setFamilyCommonName(String familyCommonName) {
        this.familyCommonName = familyCommonName;
    }

    public Integer getGenusId() {
        return genusId;
    }

    public void setGenusId(Integer genusId) {
        this.genusId = genusId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String[] getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String[] synonyms) {
        this.synonyms = synonyms;
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