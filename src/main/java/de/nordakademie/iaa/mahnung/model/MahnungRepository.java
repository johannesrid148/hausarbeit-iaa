package de.nordakademie.iaa.mahnung.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class MahnungRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(final Mahnung mahnung) {
        entityManager.persist(mahnung);
    }

    public List<Mahnung> findAll() {
        return entityManager.createQuery("SELECT r FROM Mahnung r", Mahnung.class).getResultList();
    }

    public Mahnung findOne(final long mahnungId) {
        return entityManager.find(Mahnung.class, mahnungId);
    }
}
