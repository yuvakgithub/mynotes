package interfaces;

public class App {
    public static void main(String[] args)
    {
        /*Animal animal1 = new Animal(1);
        Person person1 = new Person("Roger");

        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();
        */
         Info info1 = new Animal(1);
         Info info2 = new Person("Fed");
         info1.showInfo();
         info2.showInfo();

    }
}
