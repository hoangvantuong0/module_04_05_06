package com.example.demo_dictionary.model;

import javax.persistence.*;

@Table
@Entity
public class Dictionary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String word;
    private String mean;
    private String description;
    private String detail;
    private String extend;
    private String example;


    public Dictionary() {
    }

    public Dictionary(int id, String word, String mean, String description, String detail, String extend, String example) {
        this.id = id;
        this.word = word;
        this.mean = mean;
        this.description = description;
        this.detail = detail;
        this.extend = extend;
        this.example = example;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}