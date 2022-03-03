package com.example.korvidict.model;

import javax.persistence.*;

@Entity
@Table
public class Dictionary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String word;
    private String chinese;
    private String sino;
    private String mean;
    private String derivative;
    private String particle;
    private String note;

    @ManyToOne(targetEntity = PartsOfSpeech.class)
    @JoinColumn(name = "parts_of_speech_id")
    private PartsOfSpeech partsOfSpeech;


    @OneToOne(targetEntity = User.class)
    private User user;



    public Dictionary() {
    }

    public Dictionary(Integer id, String word, String chinese, String sino, String mean,
                      String derivative, String particle, String note, PartsOfSpeech partsOfSpeech, User user) {
        this.id = id;
        this.word = word;
        this.chinese = chinese;
        this.sino = sino;
        this.mean = mean;
        this.derivative = derivative;
        this.particle = particle;
        this.note = note;
        this.partsOfSpeech = partsOfSpeech;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getSino() {
        return sino;
    }

    public void setSino(String sino) {
        this.sino = sino;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getDerivative() {
        return derivative;
    }

    public void setDerivative(String derivative) {
        this.derivative = derivative;
    }

    public String getParticle() {
        return particle;
    }

    public void setParticle(String particle) {
        this.particle = particle;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public PartsOfSpeech getPartsOfSpeech() {
        return partsOfSpeech;
    }

    public void setPartsOfSpeech(PartsOfSpeech partsOfSpeech) {
        this.partsOfSpeech = partsOfSpeech;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
