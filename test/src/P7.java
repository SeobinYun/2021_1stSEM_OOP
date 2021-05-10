import java.util.Scanner;
public class P7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("나뉨수를 입력하시오 : ");
        int dividend =scanner.nextInt();
        System.out.println("나눗수를 입력하시오 : ");
        int divisor = scanner.nextInt();
        try{
            System.out.println(dividend + "를 " +divisor+"로 나누면 몫은 "+dividend/divisor + "입니다.");
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다");
        }
    }

}
