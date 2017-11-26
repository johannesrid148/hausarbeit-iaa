package de.nordakademie.iaa.einstellungen.ui;

import com.opensymphony.xwork2.ActionSupport;
import de.nordakademie.iaa.einstellungen.model.Einstellung;
import de.nordakademie.iaa.einstellungen.service.EinstellungService;
import org.springframework.beans.factory.annotation.Autowired;

public class EinstellungEditAction extends ActionSupport {

    private final EinstellungService einstellungService;

    private Einstellung einstellung;

    @Autowired
    public EinstellungEditAction(final EinstellungService einstellungService) {
        this.einstellungService = einstellungService;
    }

    public String getForm() {
        return SUCCESS;
    }

    public String saveSchlagwort() {
        einstellungService.create(einstellung);
        return SUCCESS;
    }

    @Override
    public void validate() {
        // more complicated validations go here!
    }

    public Einstellung getArt() {
        return einstellung;
    }

    public void setArt(final Einstellung einstellung) {
        this.einstellung = einstellung;
    }
}
