import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrList = new ArrayList<>();

        //List<Integer> arrList = new ArrayList<>(); this also works because of Polymprphism in Java and its from Interface
        //ArrayList is a class ,List Interface

        arrList.add(1);
        arrList.add(2);
        arrList.add(1);
        arrList.add(3);
        arrList.add(6);
        System.out.println(arrList);
        System.out.println(arrList.get(2));
        System.out.println(arrList.size());

        for(int i = 0;i< arrList.size();i++){
            System.out.println(arrList.get(i));
        }

        for(Integer a:arrList){
            System.out.println(a);
            arrList.remove(2);//Not efficient
            System.out.println(arrList);
            System.out.println(arrList.get(2));

        }

    }
}
