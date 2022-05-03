package com.example.tudien.model;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.List;

@Entity
@Table
public class PartsOf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(targetEntity = Dictionary.class, mappedBy = "partsOf", fetch = FetchType.EAGER,
    cascade = CascadeType.REMOVE)
    List<Dictionary> dictionaryList;

    public PartsOf() {
    }

    public PartsOf(int id, String name) {
        this.id = id;
        this.name = name;

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

}
