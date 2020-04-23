public class Constructor {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.showInfo();//Default constructor shows the data

        Student student2 = new Student("Robert");
        student2.showInfo();

        Student student3 = new Student("Robert",10);
        student3.showInfo();

        System.out.println(student3.toString());
        //Prints hashcode from Object class which is a Master class for all the classes in java. If it is not defined here.
        //We need to create method toString with same name in Constructor


    }
}

class Student{
    String name;
    int group;
    Student(){
        System.out.println("student1 is initialized with Default constructor");
        group =4;
    }
    Student(String name){
        System.out.println("Constructor with parameter");
        this.name=name;
    }
    Student(String name,int group){
        System.out.println("Constructor with two parameters");
        this.name=name;
        this.group=group;
    }
    public void showInfo(){
        System.out.println("Name: "+name+" Group: "+ group);
    }
    public String toString(){
        return name +","+group;
    }
}
