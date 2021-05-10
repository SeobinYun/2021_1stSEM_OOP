public class TT2 {
    public static void main(String[] args){
        int[][] test;
        int[] t1= {2,3,4};
        int[] t2= {5,7};
        test=new int[2][];
        test[0]=t1;
        test[1]=t2;

        for(int[] i : test){
            for(int j : i ){
                System.out.print(j + "\t");
            }
            System.out.println(" ");
        }
    }
}
