public class InheritLesson {
    public static void main(String[] args)
    {
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.sleep();

        Tiger tiger1 = new Tiger();
        tiger1.eat();
        tiger1.sleep();
        System.out.println(tiger1.super_class);
        //System.out.println(tiger1.age);Doesn't work because its Private variable in Animal

    }
}
