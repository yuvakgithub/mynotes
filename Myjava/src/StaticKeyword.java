public class StaticKeyword {
    public static void main(String[] args) {
        Employee e1 = new Employee("Abc", 21);
        Employee e2 = new Employee("ddd", 34);
        Employee.company = "Google";
        System.out.println("Company Name "+Employee.company);
        Employee.getCompany();
        e1.getCompanyName();
    }
}
class Employee {
    String name;
    int age;
    static String company;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void getCompany() {
        System.out.println("I'm from static method " + company);
        //System.out.println("I'm from static method "+name);//Doesn't work because name is not static
    }
    public void getCompanyName(){
        System.out.println("I'm from non static method " + company);
        System.out.println("I'm from non static method " + name);
    }
}