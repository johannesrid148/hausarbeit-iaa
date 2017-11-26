package de.nordakademie.iaa.mahnung.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.iaa.mahnung.model.Mahnstufe;
import de.nordakademie.iaa.mahnung.service.MahnstufeService;

public class MahnstufeEditAction extends ActionSupport {

    private final MahnstufeService mahnungService;

    private Mahnstufe mahnung;

    @Autowired
    public MahnstufeEditAction(final MahnstufeService mahnungService) {
        this.mahnungService = mahnungService;
    }

    public String getForm() {
        return SUCCESS;
    }

    public String saveMahnung() {
        mahnungService.create(mahnung);
        return SUCCESS;
    }

    @Override
    public void validate() {
        // more complicated validations go here!
    }

    public Mahnstufe getMahnung() {
        return mahnung;
    }

    public void setMahnung(final Mahnstufe mahnung) {
        this.mahnung = mahnung;
    }
}
