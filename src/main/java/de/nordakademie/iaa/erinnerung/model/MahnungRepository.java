package de.nordakademie.iaa.erinnerung.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MahnungRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(final Mahnung erinnerung) {
        entityManager.persist(erinnerung);
    }

    public List<Mahnung> findAll() {
        return entityManager.createQuery("SELECT r FROM Erinnerung r", Mahnung.class).getResultList();
    }

    public Mahnung findOne(final long studentId) {
        return entityManager.find(Mahnung.class, studentId);
    }
}
