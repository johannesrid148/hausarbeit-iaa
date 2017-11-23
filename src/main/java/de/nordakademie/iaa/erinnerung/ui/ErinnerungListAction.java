package de.nordakademie.iaa.erinnerung.ui;

import com.opensymphony.xwork2.Action;
import de.nordakademie.iaa.erinnerung.model.Erinnerung;
import de.nordakademie.iaa.erinnerung.service.ErinnerungService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ErinnerungListAction implements Action {

    private final ErinnerungService erinnerungService;

    private List<Erinnerung> erinnerungs;

    @Autowired
    public ErinnerungListAction(final ErinnerungService erinnerungService) {
        this.erinnerungService = erinnerungService;
    }

    @Override
    public String execute() {
        erinnerungs = erinnerungService.findAll();
        return SUCCESS;
    }

    public List<Erinnerung> getErinnerungs() {
        return erinnerungs;
    }
}
