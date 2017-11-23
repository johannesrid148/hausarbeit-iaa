package de.nordakademie.iaa.art.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Art")
public class Art {

    private long id;
    private String name;

    public Art() {
    }

    public Art(final long id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Art{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
