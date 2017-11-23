package de.nordakademie.iaa.erinnerung.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ErinnerungRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(final Erinnerung erinnerung) {
        entityManager.persist(erinnerung);
    }

    public List<Erinnerung> findAll() {
        return entityManager.createQuery("SELECT r FROM Erinnerung r", Erinnerung.class).getResultList();
    }

    public Erinnerung findOne(final long studentId) {
        return entityManager.find(Erinnerung.class, studentId);
    }
}
