package de.nordakademie.iaa.erinnerung.service;

import de.nordakademie.iaa.erinnerung.model.Erinnerung;
import de.nordakademie.iaa.erinnerung.model.ErinnerungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ErinnerungService {

    private final ErinnerungRepository schlagwortRepository;

    @Autowired
    public ErinnerungService(final ErinnerungRepository erinnerungRepository) {
        this.schlagwortRepository = erinnerungRepository;
    }

    @Transactional(readOnly = true)
    public List<Erinnerung> findAll() {
        return schlagwortRepository.findAll();
    }

    @Transactional
    public void create(final Erinnerung erinnerung) {
        schlagwortRepository.create(erinnerung);
    }
}
