package de.nordakademie.iaa.PublikationSchlagwort.service;

import de.nordakademie.iaa.PublikationSchlagwort.model.PublikationSchlagwort;
import de.nordakademie.iaa.PublikationSchlagwort.model.PublikationSchlagwortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PublikationSchlagwortService {

    private final PublikationSchlagwortRepository publikationRepository;

    @Autowired
    public PublikationSchlagwortService(final PublikationSchlagwortRepository publikationRepository) {
        this.publikationRepository = publikationRepository;
    }

    @Transactional(readOnly = true)
    public List<PublikationSchlagwort> findAll() {
        return publikationRepository.findAll();
    }

    @Transactional
    public void create(final PublikationSchlagwort publikation) {
        publikationRepository.create(publikation);
    }
}
