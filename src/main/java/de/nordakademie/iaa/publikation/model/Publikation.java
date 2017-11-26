package de.nordakademie.iaa.publikation.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Publikation")
public class Publikation {

    private long nkey;
    private short bestand;
    private String isbn;
    private String titel;
    private String autor;
    private String verlag;
    private Date verDatum;
    private long artId;


    public Publikation() {
    }

    public Publikation(final long nkey, final long artId, final short bestand, final Date verDatum, final String autor, final String isbn, final String titel, final String verlag) {
        this.nkey = nkey;
        this.bestand = bestand;
        this.isbn = isbn;
        this.autor = autor;
        this.titel = titel;
        this.artId = artId;
        this.verDatum = verDatum;
        this.verlag = verlag;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getNkey() {
        return nkey;
    }

    public void setNkey(final long nkey) {
        this.nkey = nkey;
    }

 //   @ManyToOne
    public long getArtId() {
        return artId;
    }

    public void setArtId(long artId) {
        this.artId = artId;
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

    @Basic
    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(final String verlag) {
        this.verlag = verlag;
    }

    @Override
    public String toString() {
        return "Publikation{" + "nkey=" + nkey + ", isbn='" + isbn + '\'' + ", verlag='" + verlag + '\'' + ", titel='" + titel + '\'' + ", autor='" + autor + '\'' + ", datum='" + verDatum + '\'' + ", artId='" + artId + '}';
    }
}
