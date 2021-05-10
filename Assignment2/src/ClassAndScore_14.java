import java.util.Scanner;
public class ClassAndScore_14 {
    public static void main(String[] args){
        String course[] ={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[]={95, 88, 76, 62,55};

        Scanner scanner = new Scanner(System.in);

        while(true) { // while문을 무한반복 시켜주는 대신 종료조건을 while문 안에 넣어줌
            System.out.print("과목 이름>>");
            String courseInput = scanner.next();
            if (courseInput.equals("그만")) { // "그만"을 입력받을시 while문 탈출
                break;
            }
            for (int i = 0; i < course.length; i++) { // course 배열의 길이만큼 입력받은 문자열이 course 배열 안에 있는지 확인
                if (courseInput.equals(course[i])) { // 입력받은 문자열이 course배열의 값 중 하나와 일치한다면 score[i]와 함께 출력
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    break; // 있는 거 확인 했으면 탈출
                }
                if (i == 4) { // 마지막 4번째 인덱스까지 확인했을 때, 입력값이 4번째 인덱스에 있었으면 위의 if문을 통해 점수 출력 후 break을 타고 for문을 탈출했을 것이다.
                    // 하지만 4번째 인덱스에도 없었을 경우, 위의 if문을 실행하지 않으므로 이쪽으로 내려오게 된다. 결국 입력값이 course 배열에 아예 없으므로 "없는 과목입니다."라는 안내문 출력
                    System.out.println("없는 과목입니다.");
                }
            }
        }
        scanner.close();
    }
}
