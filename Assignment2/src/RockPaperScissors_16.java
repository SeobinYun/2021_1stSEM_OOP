import java.util.Scanner;
public class RockPaperScissors_16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str[]={"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while(true) {
            System.out.print("가위 바위 보!>>");
            int n = (int)(Math.random()*3); // 컴퓨터의 랜덤값
            String computerOne = str[n]; // str 배열의 위치 n에 있는 값을 computerOne이라는 변수에 저장해줌
            String myOne = scanner.next(); // 사용자 입력값
            if (myOne.equals("그만")) { // 입력값이 "그만"일 때 while문 탈출
                System.out.println("게임을 종료합니다...");
                break;
            }
            if(myOne.equals(computerOne)){ // 비길 경우는 한번에 처리해줌
                System.out.println("사용자 = " + myOne + ", 컴퓨터 = " + computerOne + ", 비겼습니다.");
            }
            else if(myOne.equals("가위")){ // 가위: 비기는 경우를 제외한 바위, 보만 처리
                if(computerOne.equals("바위")){
                    System.out.println("사용자 = " + myOne + ", 컴퓨터 = " + computerOne + ", 졌습니다.");
                }
                else if(computerOne.equals("보")){
                    System.out.println("사용자 = " + myOne + ", 컴퓨터 = " + computerOne + ", 이겼습니다");
                }
                else{;}
            }
            else if(myOne.equals("바위")){ // 바위: 비기는 경우를 제외한 가위, 보만 처리
                if(computerOne.equals("가위")){
                    System.out.println("사용자 = " + myOne + ", 컴퓨터 = " + computerOne + ", 이겼습니다.");
                }
                else if(computerOne.equals("보")){
                    System.out.println("사용자 = " + myOne + ", 컴퓨터 = " + computerOne + ", 졌습니다.");
                }
                else{;}
            }
            else if(myOne.equals("보")){ // 보: 비기는 경우를 제외한 가위, 바위만 처리
                if(computerOne.equals("가위")){
                    System.out.println("사용자 = " + myOne + ", 컴퓨터 = " + computerOne + ", 졌습니다");
                }
                else if(computerOne.equals("바위")){
                    System.out.println("사용자 = " + myOne + ", 컴퓨터 = " + computerOne + ", 이겼습니다.");
                }
                else{;}
            }
        }
        scanner.close();
    }
}
