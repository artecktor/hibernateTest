package org.example.hibernate.Student;

import jakarta.persistence.*;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Entity
@SQLRestriction("deleted = false")
@SQLDelete(sql ="update Student set deleted = true where id=?")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String fatherName;
    @Formula("concat(name, ' ', father_name)")
    private String fullName;
    @Column(nullable = false)
    private boolean deleted = false;

    public Student(int id, String name, String fatherName, String fullName, boolean deleted) {
        this.id = id;
        this.name = name;
        this.fatherName = fatherName;
        this.fullName = fullName;
        this.deleted = deleted;
    }

    public Student() {}

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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
