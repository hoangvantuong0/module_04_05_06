package com.example.final_exam.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Film {
    @Id
    private String id;
    private String name;

    @OneToMany(targetEntity = ShowTime.class, mappedBy = "film",cascade = CascadeType.REMOVE)
    List<ShowTime> showList;

    public Film() {
    }

    public Film(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ShowTime> getShowList() {
        return showList;
    }

    public void setShowList(List<ShowTime> showList) {
        this.showList = showList;
    }
}
