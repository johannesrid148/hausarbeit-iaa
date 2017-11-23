package de.nordakademie.iaa.schlagwort.model;

import javax.persistence.*;

@Entity
@Table(name = "Erinnerung")
public class Schlagwort {

    private long id;
    private String name;

    public Schlagwort() {
    }

    public Schlagwort(final long id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    @Basic
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Erinnerung{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
