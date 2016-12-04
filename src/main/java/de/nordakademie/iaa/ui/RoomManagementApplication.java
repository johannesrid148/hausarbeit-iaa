package de.nordakademie.iaa.ui;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class RoomManagementApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    final Set<Class<?>> classes = new HashSet<>(super.getClasses());
    classes.add(RoomController.class);
    return classes;
  }
}
