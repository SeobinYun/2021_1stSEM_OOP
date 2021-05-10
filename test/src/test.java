public class test {

    public static void main(String[] args) {
//        while(!((!true||true)&&false)){
//            System.out.println("Success!");
//        }

//        System.out.println((double)1/4);
//        System.out.println(12+23+"45");

        try {
            String[] s = {"A", "B", "C"};
            int a = 0, b = 5;
            System.out.print(s[a / b]);

            try{
                for(int i=1; i<5; i++){
                    System.out.print(s[i]);
                }
            }
            catch(Exception e){
                System.out.println("D");
            }
            finally {
                System.out.println("E");
            }
        }
        catch(Exception e){
            System.out.println("F");
        }
        finally{
            System.out.println("G");
        }
    }
}
