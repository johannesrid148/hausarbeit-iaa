package de.nordakademie.iaa.publikation.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class PublikationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(final Publikation publikation) {
        entityManager.persist(publikation);
    }

    public List<Publikation> findAll() {
        return entityManager.createQuery("SELECT r FROM Publikation r", Publikation.class).getResultList();
    }

    public Publikation findOne(final long publikationId) {
        return entityManager.find(Publikation.class, publikationId);
    }
}
