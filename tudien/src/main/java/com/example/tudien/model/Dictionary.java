package com.example.tudien.model;

import javax.persistence.*;

@Entity
@Table
public class Dictionary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String word;
    private String mean;
    private String example;

@ManyToOne(targetEntity = PartsOf.class)
    @JoinColumn(name = "parts_of_id")

    private PartsOf partsOf;


    public Dictionary() {
    }

    public Dictionary(int id, String word, String mean, String example, PartsOf partsOf) {
        this.id = id;
        this.word = word;
        this.mean = mean;
        this.example = example;
        this.partsOf = partsOf;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public PartsOf getPartsOf() {
        return partsOf;
    }

    public void setPartsOf(PartsOf partsOf) {
        this.partsOf = partsOf;
    }
}
