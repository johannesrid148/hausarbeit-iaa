package de.nordakademie.iaa.publikation.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;

import de.nordakademie.iaa.publikation.model.Publikation;
import de.nordakademie.iaa.publikation.service.PublikationService;

public class PublikationListAction implements Action {

    private final PublikationService publikationService;

    private List<Publikation> publikations;

    @Autowired
    public PublikationListAction(final PublikationService publikationService) {
        this.publikationService = publikationService;
    }

    @Override
    public String execute() {
        publikations = publikationService.findAll();
        return SUCCESS;
    }

    public List<Publikation> getPublikations() {
        return publikations;
    }
}
