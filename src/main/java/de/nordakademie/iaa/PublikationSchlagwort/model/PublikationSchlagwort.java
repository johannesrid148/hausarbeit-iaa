package de.nordakademie.iaa.PublikationSchlagwort.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PublikationSchlagwort")
public class PublikationSchlagwort {

    private long nkey;
    private long schlagwort;


    public PublikationSchlagwort() {
    }

    public PublikationSchlagwort(final long nkey, final long schlagwort) {
        this.nkey = nkey;
        this.schlagwort = schlagwort;
    }



    @Basic
    public long getSchlagwort() {
        return schlagwort;
    }

    public void setSchlagwort(final long schlagwort) {
        this.schlagwort = schlagwort;
    }

    @Basic
    public long getNkey() {
        return nkey;
    }

    public void setNkey(final long nkey) {
        this.nkey = nkey;
    }



    @Override
    public String toString() {
        return "PublikationSchlagwort{" + "nkey=" + nkey + ", schlagwort='" + schlagwort + '}';
    }
}
