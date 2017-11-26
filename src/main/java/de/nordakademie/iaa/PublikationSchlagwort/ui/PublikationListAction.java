package de.nordakademie.iaa.PublikationSchlagwort.ui;

import com.opensymphony.xwork2.Action;
import de.nordakademie.iaa.PublikationSchlagwort.model.PublikationSchlagwort;
import de.nordakademie.iaa.PublikationSchlagwort.service.PublikationSchlagwortService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PublikationListAction implements Action {

    private final PublikationSchlagwortService publikationService;

    private List<PublikationSchlagwort> publikations;

    @Autowired
    public PublikationListAction(final PublikationSchlagwortService publikationService) {
        this.publikationService = publikationService;
    }

    @Override
    public String execute() {
        publikations = publikationService.findAll();
        return SUCCESS;
    }

    public List<PublikationSchlagwort> getPublikations() {
        return publikations;
    }
}
