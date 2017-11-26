package de.nordakademie.iaa.mahnung.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Mahnstufe")
public class Mahnstufe {

    private long id;
    private long mahnstufe;
    private Date rückgabedatum;


    public Mahnstufe() {
    }

    public Mahnstufe(final long id, final long mahnstufe, final String rückgabedatum) {
        this.id = id;
        this.mahnstufe = mahnstufe;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    @Basic
    public long getMahnstufe() {
        return mahnstufe;
    }

    public void setMahnstufe(final long mahnstufe) {
        this.mahnstufe = mahnstufe;
    }


    @Override
    public String toString() {
        return "Mahnstufe{" + "id=" + id + ", mahnstufe='" + mahnstufe + '\'' + ", rückgabedatum='" + rückgabedatum + '\'' + '}';
    }
}
