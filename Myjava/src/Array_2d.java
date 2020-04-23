public class Array_2d {
    public static void main(String[] args){
        int[][] table = {{3,4,5,6},{1,9,10,99},{5,4,3,2}};
        System.out.println(table[1][3]);
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }

    }
}
