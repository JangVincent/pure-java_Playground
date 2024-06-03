import classes.Person;
import classes.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Utils console = new Utils();

        Person person2 = new Person("YoungJin", "Jang");
        console.log(person2.getFullName());

        if (person2.getFirstName() == "John Doe") {
            throw new Exception("Person is not Initialized");
        }

        console.log("He is John Doe");
    }
}
