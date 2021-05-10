import java.util.Scanner;
public class ConvertMoney_6 {
    public static void main(String[] args){
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오>>");
        int total=scanner.nextInt(); // 변환할 금액 입력받음

        // fiftyK = 오만원 개수, tenK = 만원 개수, oneK = 천원 개수
        // fiveH = 오백원 개수, oneH = 백원 개수, fifty = 오십원 개수, ten = 십원 개수, one = 일원 개수
        int fiftyK = total/unit[0]; // 입력금액을 오만원으로 나누었을 때 몫
        int tenK = (total-(unit[0]*fiftyK))/unit[1]; // 입력금액에서 오만원단위로 뺀 금액을 만원으로 나누었을 때 몫
        int oneK = (total-(unit[0]*fiftyK)-(unit[1]*tenK))/unit[2]; // 입력금액에서 오만원,만원 단위로 뺀 금액을 천원으로 나누었을 때 몫
        int fiveH =(total-(unit[0]*fiftyK)-(unit[1]*tenK)-(unit[2]*oneK))/unit[3];
        // 입력금액에서 오만원,만원,천원 단위로 뺀 금액을 오백원으로 나누었을 때 몫
        int oneH =(total-(unit[0]*fiftyK)-(unit[1]*tenK)-(unit[2]*oneK)-(unit[3]*fiveH))/unit[4];
        // 입력금액에서 오만원, 만원, 천원, 오백원 단위로 뺀 금액을 백원으로 나누었을 때 몫
        int fifty = (total-(unit[0]*fiftyK)-(unit[1]*tenK)-(unit[2]*oneK)-(unit[3]*fiveH)-(unit[4]*oneH))/unit[5] ;
        // 입력금액에서 오만원, 만원, 천원, 오백원, 백원 단위로 뺀 금액을 오십원으로 나누었을 때 몫
        int ten=(total-(unit[0]*fiftyK)-(unit[1]*tenK)-(unit[2]*oneK)-(unit[3]*fiveH)-(unit[4]*oneH)-(unit[5]*fifty))/unit[6];
        // 입력금액에서 오만원, 만원, 천원, 오백원, 백원, 오십원 단위로 뺀 금액을 십원으로 나누었을 때 몫
        int one = (total-(unit[0]*fiftyK)-(unit[1]*tenK)-(unit[2]*oneK)-(unit[3]*fiveH)-(unit[4]*oneH)-(unit[5]*fifty)-(unit[6]*ten));
        // 입력금액에서 오만원, 만원, 천원, 오백원, 백원, 오십원, 십원 단위로 뺀 금액

        // if문을 이용해 변수의 값이 0일시엔 출력에서 제외해줌
        if (fiftyK != 0) {
            System.out.println("50000원 짜리 : " + fiftyK + "개");
        }
        if (tenK != 0) {
            System.out.println("10000원 짜리 : " + tenK + "개");
        }
        if (oneK != 0) {
            System.out.println("1000원 짜리 : " + oneK + "개");
        }
        if (fiveH != 0) {
            System.out.println("500원 짜리 : " + fiveH + "개");
        }
        if (oneH != 0) {
            System.out.println("100원 짜리 : " + oneH + "개");
        }
        if (fifty != 0) {
            System.out.println("50원 짜리 : " + fifty + "개");
        }
        if (ten != 0) {
            System.out.println("10원 짜리 : " + ten + "개");
        }
        if (one != 0) {
            System.out.println("1원 짜리 : " + one + "개");
        }
        scanner.close();
    }
}
