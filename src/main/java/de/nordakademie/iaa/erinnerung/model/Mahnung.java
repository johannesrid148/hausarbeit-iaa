package de.nordakademie.iaa.erinnerung.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Mahnung")
public class Mahnung {

    private long id;
    private Date erDate;
    private short erNummer;
    private long mahnID;

    public Mahnung() {
    }

    public Mahnung(final long id, final String name) {
        this.id = id;
        this.erDate = erDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public Date getName() {
        return erDate;
    }

    public void setName(Date name) {
        this.erDate = erDate;
    }

    public short getErNummer() {
        return erNummer;
    }

    public void setErNummer(short erNummer) {
        this.erNummer = erNummer;
    }

    public long getMahnID() {
        return mahnID;
    }

    public void setMahnID(long mahnID) {
        this.mahnID = mahnID;
    }


    @Override
    public String toString() {
        return "Erinnerung{" + "id=" + id + ", datum='" + erDate + '\'' + ", datumRückgabe='" + '}';
    }
}
