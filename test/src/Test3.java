import java.util.*;
public class Test3 {
    public static void main(String[] args){
        int first;
        String name;
        String second;

        Scanner s= new Scanner(System.in);

        name = s.nextLine();

        first=s.nextInt();
        second=s.nextLine();

        System.out.println(name+(first+second));

        s.close();
    }
}
