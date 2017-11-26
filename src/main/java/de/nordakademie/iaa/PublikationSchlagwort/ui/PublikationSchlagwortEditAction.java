package de.nordakademie.iaa.PublikationSchlagwort.ui;

import com.opensymphony.xwork2.ActionSupport;
import de.nordakademie.iaa.PublikationSchlagwort.model.PublikationSchlagwort;
import de.nordakademie.iaa.PublikationSchlagwort.service.PublikationSchlagwortService;
import org.springframework.beans.factory.annotation.Autowired;

public class PublikationSchlagwortEditAction extends ActionSupport {

    private final PublikationSchlagwortService publikationService;

    private PublikationSchlagwort publikation;

    @Autowired
    public PublikationSchlagwortEditAction(final PublikationSchlagwortService publikationService) {
        this.publikationService = publikationService;
    }

    public String getForm() {
        return SUCCESS;
    }

    public String savePublikation() {
        publikationService.create(publikation);
        return SUCCESS;
    }

    @Override
    public void validate() {
        // more complicated validations go here!
    }

    public PublikationSchlagwort getPublikation() {
        return publikation;
    }

    public void setPublikationSchlagwort(final PublikationSchlagwort publikation) {
        this.publikation = publikation;
    }
}
