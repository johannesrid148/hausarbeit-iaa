package de.nordakademie.iaa.erinnerung.service;

import de.nordakademie.iaa.erinnerung.model.Mahnung;
import de.nordakademie.iaa.erinnerung.model.MahnungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MahnungService {

    private final MahnungRepository mahnungRepository;

    @Autowired
    public MahnungService(final MahnungRepository mahnungRepository) {
        this.mahnungRepository = mahnungRepository;
    }

    @Transactional(readOnly = true)
    public List<Mahnung> findAll() {
        return mahnungRepository.findAll();
    }

    @Transactional
    public void create(final Mahnung mahnung) {
        mahnungRepository.create(mahnung);
    }
}
