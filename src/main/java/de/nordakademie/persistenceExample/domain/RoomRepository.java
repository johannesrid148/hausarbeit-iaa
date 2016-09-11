package de.nordakademie.persistenceExample.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class RoomRepository {

  @PersistenceContext
  private EntityManager entityManager;

  public void createRoom(final Room room) {
    entityManager.persist(room);
  }

  public List<Room> findAll() {
    return entityManager.createQuery("SELECT room FROM Room room", Room.class).getResultList();
  }
}
