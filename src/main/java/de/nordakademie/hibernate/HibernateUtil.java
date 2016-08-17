package de.nordakademie.hibernate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class HibernateUtil {

  private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("db");

  private HibernateUtil() {
    super();
  }

  public static EntityManagerFactory getEntityManagerFactory() {
    return EMF;
  }
}
