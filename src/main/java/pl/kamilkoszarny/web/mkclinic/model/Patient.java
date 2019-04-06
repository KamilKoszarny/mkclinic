package pl.kamilkoszarny.web.mkclinic.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String surname;

    public Patient(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Patient() {
    }
}
