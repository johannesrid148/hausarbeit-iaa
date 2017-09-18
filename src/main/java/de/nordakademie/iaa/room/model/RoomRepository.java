package de.nordakademie.iaa.room.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import de.nordakademie.iaa.Context;

public class RoomRepository {

  public void create(final Room room) {
    final EntityManager entityManager = Context.createEntityManager();

    entityManager.getTransaction().begin();
    entityManager.persist(room);
    entityManager.getTransaction().commit();

    entityManager.close();
  }

  public List<Room> findAll() {
    final EntityManager entityManager = Context.createEntityManager();

    entityManager.getTransaction().begin();
    final List<Room> rooms = entityManager.createQuery("SELECT r FROM Room r", Room.class).getResultList();
    entityManager.getTransaction().commit();

    entityManager.close();
    if (rooms != null) {
      return rooms;
    }
    return new ArrayList<>();
  }
}
