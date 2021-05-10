import java.util.Scanner;

public class Calculator_12_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        int operand1 = scanner.nextInt();
        String operator = scanner.next();
        int operand2 = scanner.nextInt();
        int answer=0;

        switch(operator){
            case "+":
                answer = operand1 + operand2;
                break;
            case "-":
                answer = operand1 - operand2;
                break;
            case "*":
                answer = operand1 * operand2;
                break;
            case "/":
                if(operand2==0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                answer = operand1/operand2;
                break;
            default: // 위의 네 가지 연산자가 아닐 시 종료
                return;
        }

        System.out.println(operand1 + operator + operand2 + "의 계산 결과는 " + answer);

        scanner.close();
    }
}
