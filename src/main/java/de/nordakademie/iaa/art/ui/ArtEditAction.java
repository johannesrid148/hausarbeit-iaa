package de.nordakademie.iaa.art.ui;

import com.opensymphony.xwork2.ActionSupport;
import de.nordakademie.iaa.art.model.Art;
import de.nordakademie.iaa.art.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;

public class ArtEditAction extends ActionSupport {

    private final ArtService artService;

    private Art art;

    @Autowired
    public ArtEditAction(final ArtService artService) {
        this.artService = artService;
    }

    public String getForm() {
        return SUCCESS;
    }

    public String saveSchlagwort() {
        artService.create(art);
        return SUCCESS;
    }

    @Override
    public void validate() {
        // more complicated validations go here!
    }

    public Art getArt() {
        return art;
    }

    public void setArt(final Art art) {
        this.art = art;
    }
}
