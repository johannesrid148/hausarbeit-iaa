package de.nordakademie.iaa.mahnung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.nordakademie.iaa.mahnung.model.Mahnstufe;
import de.nordakademie.iaa.mahnung.model.MahnstufeRepository;

@Service
public class MahnstufeService {

    private final MahnstufeRepository mahnungRepository;

    @Autowired
    public MahnstufeService(final MahnstufeRepository mahnungRepository) {
        this.mahnungRepository = mahnungRepository;
    }

    @Transactional(readOnly = true)
    public List<Mahnstufe> findAll() {
        return mahnungRepository.findAll();
    }

    @Transactional
    public void create(final Mahnstufe mahnung) {
        mahnungRepository.create(mahnung);
    }
}
