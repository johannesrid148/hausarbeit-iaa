package de.nordakademie.iaa.einstellungen.ui;

import com.opensymphony.xwork2.Action;
import de.nordakademie.iaa.einstellungen.model.Einstellung;
import de.nordakademie.iaa.einstellungen.service.EinstellungService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EinstellungListAction implements Action {

    private final EinstellungService einstellungService;

    private List<Einstellung> einstellungen;

    @Autowired
    public EinstellungListAction(final EinstellungService einstellungService) {
        this.einstellungService = einstellungService;
    }

    @Override
    public String execute() {
        einstellungen = einstellungService.findAll();
        return SUCCESS;
    }

    public List<Einstellung> getArts() {
        return einstellungen;
    }
}
