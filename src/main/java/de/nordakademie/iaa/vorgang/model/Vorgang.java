package de.nordakademie.iaa.vorgang.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Vorgang")
public class Vorgang {

    private long id;
    private Date datumAusgabe;
    private Date datumRückgabe;

    public Vorgang() {
    }

    public Vorgang(final long id, final String name) {
        this.id = id;
        this.datumAusgabe = datumAusgabe;
        this.datumRückgabe = datumRückgabe;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public Date getDatumAusgabe() {
        return datumAusgabe;
    }

    public void setDatumAusgabe(Date datumAusgabe) {
        this.datumAusgabe = datumAusgabe;
    }

    public Date getDatumRückgabe() {
        return datumRückgabe;
    }

    public void setDatumRückgabe(Date datumRückgabe) {
        this.datumRückgabe = datumRückgabe;
    }


    @Override
    public String toString() {
        return "Vorgang{" + "id=" + id + ", datumAusgabe='" + datumAusgabe + '\'' + ", datumRückgabe='" + datumRückgabe + '}';
    }
}
