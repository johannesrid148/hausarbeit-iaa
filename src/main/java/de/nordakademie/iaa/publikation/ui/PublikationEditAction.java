package de.nordakademie.iaa.publikation.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.iaa.publikation.model.Publikation;
import de.nordakademie.iaa.publikation.service.PublikationService;

public class PublikationEditAction extends ActionSupport {

    private final PublikationService publikationService;

    private Publikation publikation;

    @Autowired
    public PublikationEditAction(final PublikationService publikationService) {
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

    public Publikation getPublikation() {
        return publikation;
    }

    public void setPublikation(final Publikation publikation) {
        this.publikation = publikation;
    }
}
