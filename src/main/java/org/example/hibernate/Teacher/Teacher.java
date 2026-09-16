package org.example.hibernate.Teacher;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int NationalCode;

    public Teacher() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNationalCode() {
        return NationalCode;
    }

    public void setNationalCode(int nationalCode) {
        NationalCode = nationalCode;
    }

    public Teacher(int id, String name, int nationalCode) {
        this.id = id;
        this.name = name;
        NationalCode = nationalCode;
    }
}
