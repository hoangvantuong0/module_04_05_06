package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class PartOf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(targetEntity = Dic.class, mappedBy = "partOf", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<Dic> dicList;

    public PartOf() {
    }

    public PartOf(Integer id, String name) {
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
