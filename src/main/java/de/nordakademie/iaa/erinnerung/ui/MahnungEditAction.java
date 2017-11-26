package de.nordakademie.iaa.erinnerung.ui;

import com.opensymphony.xwork2.ActionSupport;
import de.nordakademie.iaa.erinnerung.model.Mahnung;
import de.nordakademie.iaa.erinnerung.service.MahnungService;
import org.springframework.beans.factory.annotation.Autowired;

public class MahnungEditAction extends ActionSupport {

    private final MahnungService erinnerungService;

    private Mahnung erinnerung;

    @Autowired
    public MahnungEditAction(final MahnungService erinnerungService) {
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

    public Mahnung getErinnerung() {
        return erinnerung;
    }

    public void setErinnerung(final Mahnung erinnerung) {
        this.erinnerung = erinnerung;
    }
}
