package de.nordakademie.iaa.schlagwort.ui;

import com.opensymphony.xwork2.Action;
import de.nordakademie.iaa.schlagwort.model.Schlagwort;
import de.nordakademie.iaa.schlagwort.service.SchlagwortService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SchlagwortListAction implements Action {

    private final SchlagwortService schlagwortService;

    private List<Schlagwort> schlagworts;

    @Autowired
    public SchlagwortListAction(final SchlagwortService schlagwortService) {
        this.schlagwortService = schlagwortService;
    }

    @Override
    public String execute() {
        schlagworts = schlagwortService.findAll();
        return SUCCESS;
    }

    public List<Schlagwort> getSchlagworts() {
        return schlagworts;
    }
}
