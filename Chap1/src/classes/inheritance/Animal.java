package classes.inheritance;

public class Animal {
  public String species;
  protected int age;
  protected String color;

  public Animal(String species, int age, String color) {
    this.species = species;
    this.age = age;
    this.color = color;
  }

  public void eat() {
    System.out.println("I am eating");
  }

  public void sleep() {
    System.out.println("I am sleeping");
  }

  public void walk() {
    System.out.println("I am walking");
  }

  public void makeSound() {
    System.out.println("I am making sound");
  }

  public void display() {
    System.out.println("Species: " + species);
    System.out.println("Age: " + age);
    System.out.println("Color: " + color);
    System.out.print("\n");
  }
}
