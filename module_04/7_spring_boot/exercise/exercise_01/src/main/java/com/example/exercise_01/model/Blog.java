package com.example.exercise_01.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity(name = "blog")
//@Table(name ="blog")
@Table
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String content;
//    @Pattern(regexp = "^([A-Z][a-z1-9]*\\s?)*$", message = "Wrong format, Please capitalize the first letter")
    private String note;
    @ManyToOne(targetEntity = Categorise.class)
    private Categorise categorise;
    public Blog() {
    }

    public Blog(String name, String content, String note, Categorise categorise) {
        this.name = name;
        this.content = content;
        this.note = note;
        this.categorise = categorise;
    }

    public Blog(Integer id, String name, String content, String note) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.note = note;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Categorise getCategorise() {
        return categorise;
    }

    public void setCategorise(Categorise categorise) {
        this.categorise = categorise;
    }
}
