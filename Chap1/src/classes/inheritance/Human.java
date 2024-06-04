package classes.inheritance;

public class Human extends Animal {

  public String firstName;
  public String lastName;

  public Human(String firstName, String lastName, int age, String color) {
    super("Homo sapiens", age, color);
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getUuid() {
    return this.uuid;
  }

  public void makeSound() {
    System.out.println("I am talking");
  }

  public void protectedTestChildClass() {
    System.out.println("Here is Child class");
    this.protectedTestUpperClass();
  }

  public void sayFullName() {
    String fullName = new StringBuffer().append(firstName).append(" ").append(lastName).toString();
    System.out.println(fullName);
  }
}
