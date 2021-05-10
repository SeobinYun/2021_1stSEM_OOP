import java.util.Scanner;
public class s {
    public static void main(String[] args){
        char a1='\u0061';
        Scanner scanner= new Scanner(System.in);
        String temp=scanner.next();
        char a2=temp.charAt(0);
        for(int i=a2; i>=a2; i--){
            for(int j=a1; j<=i;j++){
                System.out.println(j);
            }
            System.out.println();
        }
    }
}
