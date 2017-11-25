package de.nordakademie.iaa.schlagwort.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SchlagwortRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(final Schlagwort schlagwort) {
        entityManager.persist(schlagwort);
    }

    public List<Schlagwort> findAll() {
        return entityManager.createQuery("SELECT r FROM Schlagwort r", Schlagwort.class).getResultList();
    }

    public Schlagwort findOne(final long studentId) {
        return entityManager.find(Schlagwort.class, studentId);
    }
}
