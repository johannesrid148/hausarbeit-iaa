package de.nordakademie.iaa.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

final class HibernateUtil {

  // create a single global entity manager factory
  private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("IAA_DB");

  private HibernateUtil() {
    // private constructor to avoid instantiation
  }

  static EntityManagerFactory getEntityManagerFactory() {
    return EMF;
  }
}
