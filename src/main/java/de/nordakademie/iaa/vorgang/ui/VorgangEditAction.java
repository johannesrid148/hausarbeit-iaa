package de.nordakademie.iaa.vorgang.ui;

import com.opensymphony.xwork2.ActionSupport;
import de.nordakademie.iaa.vorgang.model.Vorgang;
import de.nordakademie.iaa.vorgang.service.VorgangService;
import org.springframework.beans.factory.annotation.Autowired;

public class VorgangEditAction extends ActionSupport {

    private final VorgangService vorgangService;

    private Vorgang vorgang;

    @Autowired
    public VorgangEditAction(final VorgangService vorgangService) {
        this.vorgangService = vorgangService;
    }

    public String getForm() {
        return SUCCESS;
    }

    public String saveSchlagwort() {
        vorgangService.create(vorgang);
        return SUCCESS;
    }

    @Override
    public void validate() {
        // more complicated validations go here!
    }

    public Vorgang getVorgang() {
        return vorgang;
    }

    public void setVorgang(final Vorgang vorgang) {
        this.vorgang = vorgang;
    }
}
