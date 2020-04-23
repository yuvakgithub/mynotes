public class StaticKeyword1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

    }
}
class Counter{
    //int count=0;//Will get the memory when the instance is created
    static int count=0;//Will get the memory only once and ratains its value
    Counter(){
        count++;
        System.out.println("count equals: "+ count);
    }
}
