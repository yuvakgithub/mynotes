package AbstractClass;

public class App {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        cat1.setId(1);

        Dog dog1 = new Dog();
        dog1.setId(11);
        //Animal an1 = new Animal();Doesn't work . Can't be initiated as it is abstract class.

        cat1.makeSound();
        dog1.makeSound();


    }
}
