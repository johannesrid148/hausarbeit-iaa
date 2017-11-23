package de.nordakademie.iaa.mahnung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.nordakademie.iaa.mahnung.model.Mahnung;
import de.nordakademie.iaa.mahnung.model.MahnungRepository;

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
