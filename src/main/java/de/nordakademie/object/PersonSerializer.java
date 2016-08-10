package de.nordakademie.object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import de.nordakademie.common.Person;

public class PersonSerializer {

  public static void main(final String[] args) {
    final Person person = new Person("Bene");

    try (final ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person"))) {
      out.writeObject(person);
    } catch (final Exception exception) {
      exception.printStackTrace();
    }
  }
}
