package de.nordakademie.iaa.schlagwort.ui;

import com.opensymphony.xwork2.ActionSupport;
import de.nordakademie.iaa.schlagwort.model.Schlagwort;
import de.nordakademie.iaa.schlagwort.service.SchlagwortService;
import org.springframework.beans.factory.annotation.Autowired;

public class SchlagwortEditAction extends ActionSupport {

    private final SchlagwortService schlagwortService;

    private Schlagwort schlagwort;

    @Autowired
    public SchlagwortEditAction(final SchlagwortService schlagwortService) {
        this.schlagwortService = schlagwortService;
    }

    public String getForm() {
        return SUCCESS;
    }

    public String saveSchlagwort() {
        schlagwortService.create(schlagwort);
        return SUCCESS;
    }

    @Override
    public void validate() {
        // more complicated validations go here!
    }

    public Schlagwort getSchlagwort() {
        return schlagwort;
    }

    public void setSchlagwort(final Schlagwort schlagwort) {
        this.schlagwort = schlagwort;
    }
}
