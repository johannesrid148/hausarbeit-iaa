package de.nordakademie.iaa.erinnerung.ui;

import com.opensymphony.xwork2.ActionSupport;
import de.nordakademie.iaa.erinnerung.model.Erinnerung;
import de.nordakademie.iaa.erinnerung.service.ErinnerungService;
import org.springframework.beans.factory.annotation.Autowired;

public class ErinnerungEditAction extends ActionSupport {

    private final ErinnerungService erinnerungService;

    private Erinnerung erinnerung;

    @Autowired
    public ErinnerungEditAction(final ErinnerungService erinnerungService) {
        this.erinnerungService = erinnerungService;
    }

    public String getForm() {
        return SUCCESS;
    }

    public String saveSchlagwort() {
        erinnerungService.create(erinnerung);
        return SUCCESS;
    }

    @Override
    public void validate() {
        // more complicated validations go here!
    }

    public Erinnerung getErinnerung() {
        return erinnerung;
    }

    public void setErinnerung(final Erinnerung erinnerung) {
        this.erinnerung = erinnerung;
    }
}
