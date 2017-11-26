package de.nordakademie.iaa.PublikationSchlagwort.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PublikationSchlagwortRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(final PublikationSchlagwort publikation) {
        entityManager.persist(publikation);
    }

    public List<PublikationSchlagwort> findAll() {
        return entityManager.createQuery("SELECT r FROM PublikationSchlagwort r", PublikationSchlagwort.class).getResultList();
    }

    public PublikationSchlagwort findOne(final long publikationId) {
        return entityManager.find(PublikationSchlagwort.class, publikationId);
    }
}
