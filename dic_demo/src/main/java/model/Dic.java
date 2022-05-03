package model;

import javax.persistence.*;

@Entity
@Table
public class Dic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String word;
    private String mean;

    @ManyToOne(targetEntity = PartOf.class)
    @JoinColumn(name = "part_of_id")
    private PartOf partOf;

    public Dic() {
    }

    public Dic(Integer id, String word, String mean, PartOf partOf) {
        this.id = id;
        this.word = word;
        this.mean = mean;
        this.partOf = partOf;
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

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public PartOf getPartOf() {
        return partOf;
    }

    public void setPartOf(PartOf partOf) {
        this.partOf = partOf;
    }
}

















