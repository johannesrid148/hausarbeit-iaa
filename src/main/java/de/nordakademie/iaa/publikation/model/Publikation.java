package de.nordakademie.iaa.publikation.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Publikation")
public class Publikation {

    private long nkey;
    private short bestand;
    private String isbn;
    private String titel;
    private String autor;
    private Date verDatum;


    public Publikation() {
    }

    public Publikation(final long nkey, final short bestand, Date verDatum, final String autor, final String isbn, final String titel) {
        this.nkey = nkey;
        this.bestand = bestand;
        this.isbn = isbn;
        this.autor = autor;
        this.titel = titel;
        this.verDatum = verDatum;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getNkey() {
        return nkey;
    }

    public void setNkey(final long nkey) {
        this.nkey = nkey;
    }

    @Basic
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(final String isbn) {
        this.isbn = isbn;
    }

    @Basic
    public String getAutor() {
        return autor;
    }

    public void setAutor(final String autor) {
        this.autor = autor;
    }

    @Basic
    public short getBestand() {
        return bestand;
    }

    public void setBestand(final short bestand) {
        this.bestand = bestand;
    }

    @Basic
    public Date getVerDatum() {
        return verDatum;
    }

    public void setVerDatum(final Date verDatum) {
        this.verDatum = verDatum;
    }

    @Basic
    public String getTitel() {
        return titel;
    }

    public void setTitel(final String titel) {
        this.titel = titel;
    }

    @Override
    public String toString() {
        return "Publikation{" + "nkey=" + nkey + ", isbn='" + isbn + '\'' + ", titel='" + titel + '\'' + ", autor='" + autor + '\'' + ", datum='" + verDatum + '\'' + '}';
    }
}
