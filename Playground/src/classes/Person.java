package classes;

public class Person {
  String firstName;
  String lastName;

  public Person() {
      this.firstName = "John";
      this.lastName = "Doe";
  }

  public Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
  }

  public String getFullName() {
      return this.firstName + " " + this.lastName;
  }

  public String getFirstName() {
      return this.firstName;
  }

  public String getLastName() {
      return this.lastName;
  }
}
