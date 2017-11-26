package de.nordakademie.iaa.erinnerung.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Mahnung")
public class Mahnung {

    private long id;
    private long nkey;
    private long matrikelnummer;
    private long mahnID;

    public Mahnung() {
    }

    public Mahnung(final long id, final long nkey, final long matrikelnummer, final long mahnID) {
        this.id = id;
        this.nkey = nkey;
        this.matrikelnummer = matrikelnummer;
        this.mahnID = mahnID;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public long getNkey() {
        return nkey;
    }

    public void setNkey (long nkey) {
        this.nkey = nkey;
    }

    public long getmMtrikelnummer() {
        return matrikelnummer;
    }

    public void setmatrikelnummer(long matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public long getMahnID() {
        return mahnID;
    }

    public void setMahnID(long mahnID) {
        this.mahnID = mahnID;
    }


    @Override
    public String toString() {
        return "Mahnung{" + "id=" + id + ", nkey='" + nkey + '\'' +  ", mahnID='" + mahnID + '\'' +", matrikelnummer='" + matrikelnummer+ '}';
    }
}
