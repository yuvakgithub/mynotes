public class IfStatement {
    public static void main(String[] args){
        int value  = 11;
        if(value >10){
            System.out.println("Number greater than 10");
        }
        double PI = 3.14;
        double area;
        double radius =10;
        if(radius>0){
            area =  PI*radius*radius;
            System.out.println("Area of the cirle :"+area);
        } else if(radius ==0 )
        {
            System.out.println("area of circle with radius '0' is 0 ");
        }
        else{
            System.out.println("Negtive value");
        }

    }
}
