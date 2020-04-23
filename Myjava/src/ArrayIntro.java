public class ArrayIntro {
    public static void main(String[] args){
        int[] values = new int[4];
        System.out.println(values[0]);
        values[0] = 10;
        System.out.println(values[0]);

        int[] num = {1,3,4,6};
        System.out.println(num[2]);
        System.out.println(num.length);

        String[] fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "grape";
        fruits[2] = "orange";
        System.out.println(fruits[0]);

        String[] cars = {"audi","Benz","bmw"};
        System.out.println(cars[0]);


    }
}
