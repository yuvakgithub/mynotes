public class EncapsulationSetGet {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setName("Yuva");
        person1.setAge(30);
        System.out.println("Out put values from main function name is " + person1.getName() + " and  age is " + person1.getAge());
        person1.speak();
    }
    }
class Person1 {
    private String loginName;
    private int age;

    public void setName(String userName) {
        loginName = userName;
    }

    public String getName() {
        return loginName;
    }

    public void setAge(int userAge) {
        age = userAge;
    }

    public int getAge() {
        return age;
    }

    void speak() {
        System.out.println("My name is " + loginName + " and My age is " + age);
    }

}