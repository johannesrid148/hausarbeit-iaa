package de.nordakademie.iaa.schlagwort.service;

import de.nordakademie.iaa.schlagwort.model.Schlagwort;
import de.nordakademie.iaa.schlagwort.model.SchlagwortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SchlagwortService {

    private final SchlagwortRepository schlagwortRepository;

    @Autowired
    public SchlagwortService(final SchlagwortRepository schlagwortRepository) {
        this.schlagwortRepository = schlagwortRepository;
    }

    @Transactional(readOnly = true)
    public List<Schlagwort> findAll() {
        return schlagwortRepository.findAll();
    }

    @Transactional
    public void create(final Schlagwort schlagwort) {
        schlagwortRepository.create(schlagwort);
    }
}
