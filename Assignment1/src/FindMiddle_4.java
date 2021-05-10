import java.util.Scanner;

public class FindMiddle_4 {
    public static void main(String[] args){
        System.out.print("정수 3개 입력>>");

        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // 값 비교 시작
        if(first>third){ // 첫번째 수와 세번째 수 비교 (첫번째 수가 세번째 수보다 클시 서로 값 변경)
            int tmp=third;
            third=first;
            first=tmp;
        }
        else{;} // 같지 않다면 그냥 넘어감

        // 첫번째 수와 세번째 수 위치 정정 후, 두번째 숫자 기준으로 값 비교
        if(second>third) { // 두번째 수가 세번째 수보다 클 경우 서로 값 변경
            int tmp = third;
            third = second;
            second = tmp;
        }
        else if(second<first){ // 첫번째 수가 두번째 수보다 클 경우 서로 값 변경
            int tmp=second;
            second=first;
            first=tmp;
        }
        else{;} // 전체적으로 위치가 완전히 올바르면 넘어감

        int answer = second; // answer: 출력값

        System.out.println("중간 값은 "+answer);
/*        System.out.println("첫번째 "+first);
        System.out.println("두번째 "+second);
        System.out.println("세번째 "+third);
*/
        scanner.close();
    }
}
