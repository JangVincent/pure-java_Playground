import classes.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        System.out.println(person.getFullName());

        Person person2 = new Person("YoungJin", "Jang");
        System.out.println(person2.getFirstName() + " " + person2.getLastName());


        if(person.getFirstName() == "John Doe") {
            System.out.println("He is John Doe");
        } else {
            throw new Exception("Person is not Initialized");
        }
    }
}
