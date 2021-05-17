import java.util.Scanner;

public class Grade_2 {
    private int math; // math, science, english 필드를 private로 선언
    private int science;
    private int english;

    Grade_2(int math, int science, int english){ // Grade_2의 생성자
        this.math = math;
        this.science = science;
        this.english = english;
    }

    private int average(){ // 평균을 return하는 average() method
        if(math>=0 && science>=0 && english>=0) { // 입력된 수가 0 이상일 경우만 평균값을 리턴하도록 함.
            return (math + science + english) / 3;
        }
        else{
            throw new IllegalArgumentException("입력된 수가 0 이상이 아닙니다.");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade_2 me = new Grade_2(math, science, english);
        System.out.println("평균은 "+me.average());

        scanner.close();
    }
}
