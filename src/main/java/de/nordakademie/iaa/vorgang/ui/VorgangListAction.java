package de.nordakademie.iaa.vorgang.ui;

import com.opensymphony.xwork2.Action;
import de.nordakademie.iaa.vorgang.model.Vorgang;
import de.nordakademie.iaa.vorgang.service.VorgangService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VorgangListAction implements Action {

    private final VorgangService vorgangService;

    private List<Vorgang> vorgangs;

    @Autowired
    public VorgangListAction(final VorgangService vorgangService) {
        this.vorgangService = vorgangService;
    }

    @Override
    public String execute() {
        vorgangs = vorgangService.findAll();
        return SUCCESS;
    }

    public List<Vorgang> getVorgangs() {
        return vorgangs;
    }
}
