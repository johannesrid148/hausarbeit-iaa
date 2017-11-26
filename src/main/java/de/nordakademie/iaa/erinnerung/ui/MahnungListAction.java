package de.nordakademie.iaa.erinnerung.ui;

import com.opensymphony.xwork2.Action;
import de.nordakademie.iaa.erinnerung.model.Mahnung;
import de.nordakademie.iaa.erinnerung.service.MahnungService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MahnungListAction implements Action {

    private final MahnungService erinnerungService;

    private List<Mahnung> erinnerungs;

    @Autowired
    public MahnungListAction(final MahnungService erinnerungService) {
        this.erinnerungService = erinnerungService;
    }

    @Override
    public String execute() {
        erinnerungs = erinnerungService.findAll();
        return SUCCESS;
    }

    public List<Mahnung> getErinnerungs() {
        return erinnerungs;
    }
}
