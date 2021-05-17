import java.util.Scanner;

public class Grade_2 {
    private int math;
    private int science;
    private int english;

    Grade_2(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }

    private int average(){
        if(math>=0 && science>=0 && english>=0) {
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
