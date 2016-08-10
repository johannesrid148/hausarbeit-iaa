package de.nordakademie.object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import de.nordakademie.common.Person;

public class PersonReader {

  public static void main(final String[] args) {
    try (final ObjectInputStream in = new ObjectInputStream(new FileInputStream("person"))) {
      final Person person = (Person) in.readObject();
      System.out.println(person.getName());
    } catch (final Exception exception) {
      exception.printStackTrace();
    }
  }
}
