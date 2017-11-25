package de.nordakademie.iaa.student.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(final Student student) {
        entityManager.persist(student);
    }

    public List<Student> findAll() {
        return entityManager.createQuery("SELECT r FROM Student r", Student.class).getResultList();
    }

    public Student findOne(final long studentId) {
        return entityManager.find(Student.class, studentId);
    }
}
