package de.nordakademie.iaa.einstellungen.service;

import de.nordakademie.iaa.einstellungen.model.Einstellung;
import de.nordakademie.iaa.einstellungen.model.EinstellungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EinstellungService {

    private final EinstellungRepository einstellungRepository;

    @Autowired
    public EinstellungService(final EinstellungRepository einstellungRepository) {
        this.einstellungRepository = einstellungRepository;
    }

    @Transactional(readOnly = true)
    public List<Einstellung> findAll() {
        return einstellungRepository.findAll();
    }

    @Transactional
    public void create(final Einstellung einstellung) {
        einstellungRepository.create(einstellung);
    }
}
