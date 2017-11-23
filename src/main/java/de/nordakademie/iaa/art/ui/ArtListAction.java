package de.nordakademie.iaa.art.ui;

import com.opensymphony.xwork2.Action;
import de.nordakademie.iaa.art.model.Art;
import de.nordakademie.iaa.art.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArtListAction implements Action {

    private final ArtService artService;

    private List<Art> arts;

    @Autowired
    public ArtListAction(final ArtService artService) {
        this.artService = artService;
    }

    @Override
    public String execute() {
        arts = artService.findAll();
        return SUCCESS;
    }

    public List<Art> getArts() {
        return arts;
    }
}
