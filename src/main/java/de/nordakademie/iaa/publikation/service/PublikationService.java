package de.nordakademie.iaa.publikation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.nordakademie.iaa.publikation.model.Publikation;
import de.nordakademie.iaa.publikation.model.PublikationRepository;

@Service
public class PublikationService {

    private final PublikationRepository publikationRepository;

    @Autowired
    public PublikationService(final PublikationRepository publikationRepository) {
        this.publikationRepository = publikationRepository;
    }

    @Transactional(readOnly = true)
    public List<Publikation> findAll() {
        return publikationRepository.findAll();
    }

    @Transactional
    public void create(final Publikation publikation) {
        publikationRepository.create(publikation);
    }
}
