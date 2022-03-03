package com.example.vikordic.model;


import javax.persistence.*;
import java.util.List;

@Table(name = "parts_of_speech",uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
//@Table
@Entity
public class PartsOfSpeech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(targetEntity = Dictionary.class, mappedBy = "partsOfSpeech",
            fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
////
//    @OneToMany(targetEntity = Dictionary.class, mappedBy = "partsOfSpeech",
//            fetch = FetchType.EAGER, cascade = CascadeType.ALL)

    List<Dictionary> dictionaryList;

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


    //    @Override
//    public String toString() {
//        return "PartsOfSpeech{" +
//                "id=" + id +
//                ", p_name='" + p_name + '\'' +
//                '}';
//    }
}
