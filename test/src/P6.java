public class P6 {
    public static void main(String[] args){
        int[] a= {10,100};
        int[] b= {20,200,2000};

        int[][] test = new int[2][];
        test[0]=a;
        test[1]=b;

        for(int i=0; i<test.length; i++){
            for(int j=0; j<test[i].length; j++){
                System.out.print(test[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
