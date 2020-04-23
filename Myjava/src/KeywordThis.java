public class KeywordThis {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Yuva");
        human.setAge(30);
        System.out.println("Out put values from main function name is " + human.getName() + " and  age is " + human.getAge());
        human.speak();
    }
}

class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void speak() {
        System.out.println("My name is " + name + " and My age is " + age);
    }

}