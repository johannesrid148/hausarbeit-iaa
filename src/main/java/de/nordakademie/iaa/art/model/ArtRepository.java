package de.nordakademie.iaa.art.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ArtRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(final Art art) {
        entityManager.persist(art);
    }

    public List<Art> findAll() {
        return entityManager.createQuery("SELECT r FROM Art r", Art.class).getResultList();
    }

    public Art findOne(final long studentId) {
        return entityManager.find(Art.class, studentId);
    }
}
