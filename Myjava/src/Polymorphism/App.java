package Polymorphism;


public class App {
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Animal animal1 = new Cat();//Polymorphism allows to create objects like this
        Cat cat = new Cat();
        Mouse mouse = new Mouse();
        animal.eat();
        animal1.eat();//Late binding by overriding function in sub class
        cat.eat();
        System.out.println("*********************************");



        App(animal);
        App(animal1);
        App(cat);
        App(mouse);


    }
    public static void App(Animal animal){
        animal.eat();
    }
}
