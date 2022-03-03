package com.example.korvidict.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class PartsOfSpeech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(targetEntity = Dictionary.class, mappedBy = "partsOfSpeech",
            fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<Dictionary> dictionaryList;

    public PartsOfSpeech() {
    }

    public PartsOfSpeech(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
