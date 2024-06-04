package classes.inheritance;

public class Human extends Animal {

  public String firstName;
  public String lastName;

  public Human(String firstName, String lastName, int age, String color) {
    super("Homo sapiens", age, color);
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void eat() {
    System.out.println("I am eating with fork and knife");
  }

  public void sleep() {
    System.out.println("I am sleeping on bed");
  }

  public void walk() {
    System.out.println("I am walking on two legs");
  }

  public void makeSound() {
    System.out.println("I am talking");
  }

  public void sayFullName() {
    String fullName = new StringBuffer().append(firstName).append(" ").append(lastName).toString();
    System.out.println(fullName);
  }
}
