public class Static_Keyword {
    public static void main(String[] args){
        final int x =5;
        System.out.println(x);
        //x=10;//Doesn't work

    }
}

class Test{
    public  static final int PAY_RATE =10;


    /* If we use static - we need to initialise only in class not in constructor
    Test(int PAY_RATE){
        this.PAY_RATE = PAY_RATE;
    }
*/
    /*
    public void setPayrate(int x){
        this.PAY_RATE = x;//This doesn't work because of final
    }
    */

}
