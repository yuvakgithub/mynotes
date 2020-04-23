import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the text");
        String value = input.nextLine();

        System.out.println("You entered: "+value);

        System.out.println("Please enter the Number");
        int value1 = input.nextInt();

        System.out.println("You entered: "+value1);



    }
}
