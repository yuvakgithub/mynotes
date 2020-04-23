public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Anitha";
        person1.age = 27;
        person1.speak();
        person1.ageRange();
        int year1 = person1.calcYrsToRet();
        System.out.println("Person has "+year1+" to Retirement");

        Person person2 = new Person();
        person2.name = "Lakshmi";
        person2.age=68;
        person2.speak();
        person2.ageRange();
        int year2 = person2.calcYrsToRet();
        System.out.println("Person has "+year2+" to Retirement");

        //Without method
        //System.out.println("My name is "+person1.name+" and My age is "+person1.age);
        //System.out.println("My name is "+person2.name+" and My age is "+person2.age);
        Person person3 = new Person();
        person3.setDetails("kish",30);

        person3.speak();
        person3.ageRange();
        int year3 = person3.calcYrsToRet();
        System.out.println("Person has "+year3+" to Retirement");

    }
}

class Person{
    String name;
    int age;
    void setDetails(String userName,int userAge){
        name = userName;
        age =userAge;
    }
    void speak(){
        System.out.println("Hello");
        System.out.println("My name is "+name+" and My age is "+age);
    }
    void ageRange(){
        if(age >65){
            System.out.println("You are on retirement");
        }else {
            System.out.println("You are not on retirement");
        }
    }
    int calcYrsToRet(){
        int years = 70 - age;
        return years;
    }
}
