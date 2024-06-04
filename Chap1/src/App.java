import classes.inheritance.Human;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inheritance in Java\n");

        Human testHuman = new Human("YoungJin", "Jang", 29, "yello");

        // Human 클래스는 Animal 클래스를 상속받았기 때문에 Animal 클래스의 메소드를 사용할 수 있음
        testHuman.display();
        System.out.print("\n");

        // Animal 클래스의 makeSound() 메소드를 Human 클래스에서 오버라이딩 했기 때문에
        // Human 클래스의 makeSound() 메소드가 호출됨
        testHuman.makeSound();
        System.out.print("\n");

        // 자식 클래스 (Human) 은 부모가 가지고 있지 않은 메소드 또는 변수를 가질 수 있음
        testHuman.sayFullName();
        System.out.print("\n");

        testHuman.protectedTestChildClass(); // protectedTestUpperClass() 메소드 호출. 부모 클래스의 protected 메소드를 호출할 수 있음
        System.out.print("\n");
    }
}
