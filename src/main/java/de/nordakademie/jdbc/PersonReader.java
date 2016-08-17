package de.nordakademie.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.nordakademie.common.Person;

public class PersonReader {

  public static void main(final String[] args) {
    try (final Connection connection = getConnection()) {
      final ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM PERSON");
      while (resultSet.next()) {
        final Person person = new Person();
        person.setName(resultSet.getString(1));
        System.out.println(person.getName());
      }
    } catch (final SQLException sqlException) {
      sqlException.printStackTrace();
    }
  }

  private static Connection getConnection() throws SQLException {
    return DriverManager.getConnection("jdbc:h2:~/dev/nordakademie/persistenceExample/db", "bene", "bene");
  }
}
