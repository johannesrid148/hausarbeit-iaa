package de.nordakademie.iaa.einstellungen.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EinstellungRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(final Einstellung einstellung) {
        entityManager.persist(einstellung);
    }

    public List<Einstellung> findAll() {
        return entityManager.createQuery("SELECT r FROM Einstellung r", Einstellung.class).getResultList();
    }

    public Einstellung findOne(final long studentId) {
        return entityManager.find(Einstellung.class, studentId);
    }
}
