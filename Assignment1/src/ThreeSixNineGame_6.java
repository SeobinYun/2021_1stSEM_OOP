import java.util.Scanner;

public class ThreeSixNineGame_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int number = scanner.nextInt();

        if(number>=1 && number<=99){
            int units=number%10; // 일의 자리 수 구함
            int tens=number/10; // 십의 자리 수 구함
            if((units==3 || units==6 || units==9) && (tens==3 || tens==6 || tens==9)) { // 일의 자리와 십의 자리 둘 다 3, 6, 9 있을 경우 (&& 연산자 사용)
                System.out.println("박수짝짝");
            }
            else if((units==3||units==6||units==9) || (tens==3 || tens==6 || tens==9)){ // 한 곳에만 있을 경우 (|| 연산자 사용)
                System.out.println("박수짝");
            }
        }

        scanner.close();
    }
}
