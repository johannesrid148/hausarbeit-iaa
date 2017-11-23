package de.nordakademie.iaa.vorgang.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class VorgangRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(final Vorgang vorgang) {
        entityManager.persist(vorgang);
    }

    public List<Vorgang> findAll() {
        return entityManager.createQuery("SELECT r FROM Vorgang r", Vorgang.class).getResultList();
    }

    public Vorgang findOne(final long studentId) {
        return entityManager.find(Vorgang.class, studentId);
    }
}
