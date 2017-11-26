package de.nordakademie.iaa.einstellungen.model;

import javax.persistence.*;

@Entity
@Table(name = "Einstellung")
public class Einstellung {

    private long id;
    private String name;

    public Einstellung() {
    }

    public Einstellung(final long id, final String name) {
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
