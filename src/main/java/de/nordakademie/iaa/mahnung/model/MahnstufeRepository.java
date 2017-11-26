package de.nordakademie.iaa.mahnung.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class MahnstufeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(final Mahnstufe mahnung) {
        entityManager.persist(mahnung);
    }

    public List<Mahnstufe> findAll() {
        return entityManager.createQuery("SELECT r FROM Mahnstufe r", Mahnstufe.class).getResultList();
    }

    public Mahnstufe findOne(final long mahnungId) {
        return entityManager.find(Mahnstufe.class, mahnungId);
    }
}
