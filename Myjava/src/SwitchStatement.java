import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter week no: 0-6");
        int number = input.nextInt();

        switch(number){
            case 0: System.out.println("Sunday");
                break;
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tueseday");
                break;
            case 3: System.out.println("Wendesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            default: System.out.println("none");
        }
    }
}
