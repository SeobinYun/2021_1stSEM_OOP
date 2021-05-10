import java.util.Scanner;

public class SameUnitsTens_2 {
    public static void main(String args[]){
        System.out.print("2자리수 정수 입력(10~99)>>");

        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        if(number>=10 && number<=99){
            int unit=number%10;  // 나머지 연산자를 이용하여 일의 자리 수를 구함.
            int tens=number/10;  // 나누기 연산자를 이용하여 십의 자리 수를 구함.

            if(unit==tens){
                System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
            }
        }
        scanner.close();
    }
}
