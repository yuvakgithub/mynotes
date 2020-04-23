public class Equal {
    public static void main(String[] args)
    {
        Num num1 = new Num(1);
        Num num2 = new Num(1);
        System.out.println(num1.equals(num2));
        String str1 = "AC";
        String str2 = "AC";
        System.out.println(str1.equals(str2));

    }
}

 class Num{
    public int id;
    public Num(int id){
        this.id = id;
    }
    public  boolean equals(Object obj){
        Num OtherNum = (Num) obj;
        return this.id == OtherNum.id;
    }

 }