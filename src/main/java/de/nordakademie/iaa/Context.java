package de.nordakademie.iaa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import de.nordakademie.iaa.model.RoomRepository;
import de.nordakademie.iaa.service.RoomService;

@WebListener
public class Context implements ServletContextListener {

  public static final RoomRepository ROOM_REPOSITORY = new RoomRepository();
  public static final RoomService ROOM_SERVICE = new RoomService();

  private static EntityManagerFactory entityManagerFactory;

  public static EntityManager createEntityManager() {
    if (entityManagerFactory == null) {
      throw new IllegalStateException("ServletContext is not initialized yet.");
    }
    return entityManagerFactory.createEntityManager();
  }

  @Override
  public void contextInitialized(final ServletContextEvent servletContextEvent) {
    entityManagerFactory = Persistence.createEntityManagerFactory("IAA_DB");
    System.out.println("<------------ ServletContext initialized ------------>");
  }

  @Override
  public void contextDestroyed(final ServletContextEvent servletContextEvent) {
    entityManagerFactory.close();
    System.out.println("<------------ ServletContext destroyed ------------>");
  }
}
