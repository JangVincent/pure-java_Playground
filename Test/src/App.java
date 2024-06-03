import classes.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person person2 = new Person("YoungJin", "Jang");
        System.out.println(person2.getFirstName() + " " + person2.getLastName());


        if(person2.getFirstName() == "John Doe") {
            throw new Exception("Person is not Initialized");
        } 

        System.out.println("He is John Doe");
    }
}
