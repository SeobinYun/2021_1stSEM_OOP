import java.util.Scanner;

public class Example2_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("초 단위의 정수를 입력하세여");

        int time= scanner.nextInt();
        int second = time%60;
        int minute = (time/60)%60;
        int hour = (time/60)/60;

        System.out.println(time + "초는 " + hour + "시, " + minute + "분, " + second + "초입니다." );

        scanner.close();

    }
}
