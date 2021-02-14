package werth.matt.SimpleSpring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

    @Entity //marks this as a JPA entity. creates a table for us..
    public class Plant {
        @Id // marks this as the primary key of the database..
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private Integer year;
        private String name;
        private String location; //Correct: 41.40338, 2.17403.
        private String plantType;
        private LocalDate datePlanted;

        public Plant(){}

        public Plant(String name, String location, String plantType, LocalDate datePlanted) {
            this.name = name;
            this.location = location;
            this.plantType = plantType;
            this.datePlanted = datePlanted;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }


        public String getPlantType() {
            return plantType;
        }

        public void setPlantType(String plantType) {
            this.plantType = plantType;
        }

        public LocalDate getDatePlanted() {
            return datePlanted;
        }

        public void setDatePlanted(LocalDate datePlanted) {
            this.datePlanted = datePlanted;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }
    }
