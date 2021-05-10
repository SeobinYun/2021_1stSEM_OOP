import java.util.Scanner;
public class MakeRandomArray_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int index = scanner.nextInt(); // 배열 길이를 입력받음
       // System.out.println("OK!");

        if(index>=1 && index<=100) { // 입력값이 100 이하일때만 실행하도록 조건을 걺
            int[] arr = new int[index]; // 입력값만큼의 배열 생성
            // System.out.println("OK1!");

            for (int i = 0; i < arr.length; i++) { // 배열 길이만큼
                arr[i] = (int) (Math.random() * 100 + 1); // Math.random()을 이용해 배열 인덱스마다 랜덤값 할당

                for (int j = 0; j < i; j++) { // 중복값 확인: 배열 인덱스 j부터, j가 i 전일때까지 비교 반복
                    if (arr[j] == arr[i]) { // 인덱스 j방의 값과 i방의 값이 같다면
                        i--; // i방의 값을 다시 할당받아야 하기때문에 i--를 해주고(왜냐면 i for문에서 i++가 되기 때문에) 비교반복문 탈출
                        break;
                    }
                    else {;}
                }
            }

            //System.out.println("OK2!");
            for (int i = 0; i < arr.length; i++) { // 출력
                System.out.print(arr[i] + "\t");
                if (((i + 1) % 10) == 0) { // 배열인덱스는 0부터 시작하니까 i+1로 개행 타이밍을 계산, i+1을 10으로 나누었을 때 개행 해줌
                    System.out.println();
                }
            }
        }
        scanner.close();
    }
}
