package de.nordakademie.iaa.mahnung.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;

import de.nordakademie.iaa.mahnung.model.Mahnstufe;
import de.nordakademie.iaa.mahnung.service.MahnstufeService;

public class MahnungListAction implements Action {

    private final MahnstufeService mahnungService;

    private List<Mahnstufe> mahnungs;

    @Autowired
    public MahnungListAction(final MahnstufeService mahnungService) {
        this.mahnungService = mahnungService;
    }

    @Override
    public String execute() {
        mahnungs = mahnungService.findAll();
        return SUCCESS;
    }

    public List<Mahnstufe> getMahnungs() {
        return mahnungs;
    }
}
