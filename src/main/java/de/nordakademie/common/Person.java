package de.nordakademie.common;

import java.io.Serializable;

public class Person implements Serializable {

  private final String name;

  public Person(final String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
