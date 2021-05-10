import org.w3c.dom.ls.LSOutput;

public class P21 {
    public static void main(String[] args) {
        String[] ary = {"A", "B", "C"};
        int a = 0, b = 5;

        try {
            System.out.print(ary[a / 5]);
            try {
                for (int i = 1; i < 4; ++i)
                    System.out.print(ary[i]);
            } catch (Exception e) {
                System.out.println("D");
            } finally {
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
