import classes.Person;
import classes.Programmer;
import classes.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Utils console = new Utils();

        Person person2 = new Person("YoungJin", "Jang");

        if (person2.getFirstName() == "John Doe") {
            throw new Exception("Person is not Initialized");
        }

        // For Inheritance Test

        Programmer prog1 = new Programmer(person2, "Java", "Backend Engineer", "CatzeLabs", 3);

        console.log(prog1.getFullName());

        if (prog1.getFullName() == "John Doe") {
            throw new Exception("Programmer name is not Initialized");
        }

        console.log(prog1.getFormattedIntroduction() + '\n');

        // Change most used Language
        prog1.setMostUseLanguage("Javascript/Typescript");

        if (prog1.getMostUseLanguage() == "Java") {
            throw new Exception("Most used language is not changed");
        }

        console.log(prog1.getFormattedIntroduction());

    }
}
