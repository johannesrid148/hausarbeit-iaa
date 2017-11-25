package de.nordakademie.iaa.art.service;

import de.nordakademie.iaa.art.model.Art;
import de.nordakademie.iaa.art.model.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArtService {

    private final ArtRepository schlagwortRepository;

    @Autowired
    public ArtService(final ArtRepository artRepository) {
        this.schlagwortRepository = artRepository;
    }

    @Transactional(readOnly = true)
    public List<Art> findAll() {
        return schlagwortRepository.findAll();
    }

    @Transactional
    public void create(final Art art) {
        schlagwortRepository.create(art);
    }
}
