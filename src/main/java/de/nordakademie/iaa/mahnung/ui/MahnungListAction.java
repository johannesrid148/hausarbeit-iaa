package de.nordakademie.iaa.mahnung.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;

import de.nordakademie.iaa.mahnung.model.Mahnung;
import de.nordakademie.iaa.mahnung.service.MahnungService;

public class MahnungListAction implements Action {

    private final MahnungService mahnungService;

    private List<Mahnung> mahnungs;

    @Autowired
    public MahnungListAction(final MahnungService mahnungService) {
        this.mahnungService = mahnungService;
    }

    @Override
    public String execute() {
        mahnungs = mahnungService.findAll();
        return SUCCESS;
    }

    public List<Mahnung> getMahnungs() {
        return mahnungs;
    }
}
