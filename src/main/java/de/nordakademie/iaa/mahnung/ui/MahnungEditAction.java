package de.nordakademie.iaa.mahnung.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.iaa.mahnung.model.Mahnung;
import de.nordakademie.iaa.mahnung.service.MahnungService;

public class MahnungEditAction extends ActionSupport {

    private final MahnungService mahnungService;

    private Mahnung mahnung;

    @Autowired
    public MahnungEditAction(final MahnungService mahnungService) {
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

    public Mahnung getMahnung() {
        return mahnung;
    }

    public void setMahnung(final Mahnung mahnung) {
        this.mahnung = mahnung;
    }
}
