package de.nordakademie.iaa.vorgang.service;

import de.nordakademie.iaa.vorgang.model.Vorgang;
import de.nordakademie.iaa.vorgang.model.VorgangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VorgangService {

    private final VorgangRepository schlagwortRepository;

    @Autowired
    public VorgangService(final VorgangRepository vorgangRepository) {
        this.schlagwortRepository = vorgangRepository;
    }

    @Transactional(readOnly = true)
    public List<Vorgang> findAll() {
        return schlagwortRepository.findAll();
    }

    @Transactional
    public void create(final Vorgang vorgang) {
        schlagwortRepository.create(vorgang);
    }
}
