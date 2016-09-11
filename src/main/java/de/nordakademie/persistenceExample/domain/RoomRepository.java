package de.nordakademie.persistenceExample.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import de.nordakademie.persistenceExample.domain.model.Room;

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
