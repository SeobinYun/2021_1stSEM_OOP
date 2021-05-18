package num12;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Booking_12 {
    public static void main(String[] args){
        String[] S = {"---","---","---","---","---","---","---","---","---","---"}; // S열 정보
        String[] A = {"---","---","---","---","---","---","---","---","---","---"}; // A열 정보
        String[] B = {"---","---","---","---","---","---","---","---","---","---"}; // B열 정보
        String[][] array = {S,A,B}; // 이차원 배열 array를 선언해 S,A,B를 넣어줌

        Scanner scanner = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true) { // 4가 입력될 때까지 계속 반복
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            try {
                int num = scanner.nextInt();
                switch (num) {
                    case 1: // 1. 예약, 예약 메소드로 연결
                        reservation(array);
                        break;
                    case 2: // 2. 조회, 조회 메소드로 연결
                        check(array);
                        break;
                    case 3: // 3. 취소, 취소 메소드로 연결
                        cancel(array);
                        break;
                    case 4: // 4. 끝내기, 걍 return 해버려서 main을 끝내버림
                        return;
                    default: // 1~4 이외의 숫자일 경우 
                        System.out.println("1~4 이외의 수를 입력하셨습니다. 다시 실행해주세요.");
                }
            }
            catch (InputMismatchException e){ // 입력 형식이 잘못되었을 경우 오류 메세지 출력
                System.out.println("잘못된 형식을 입력하셨습니다.");
            }
        }
    }

    static void reservation(String[][] a){ // 1. 예약 메소드, String[][]형을 파라미터로 받음
        Scanner scanner = new Scanner(System.in);
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        try {
            int num = scanner.nextInt();
            String name;
            int where;
            switch (num) {
                case 1: // S열
                    System.out.print("S>>");
                    for (int i = 0; i < a[0].length; i++) { // S열 현황 출력
                        System.out.print(" " + a[0][i]);
                    }
                    System.out.print("\n이름>>");
                    name = scanner.next();
                    do {
                        System.out.print("번호>>");
                        where = scanner.nextInt();
                    } while (where > 10 || where < 1); // 번호 입력받는데 1~10 사이 조건을 걸어줌

                    a[0][where-1] = name; // 그리고 입력받은 번호-1로 좌석을 지정해줌. 여기서 a[0]은 S열
                    break;
                case 2: // A열 
                    System.out.print("A>>");
                    for (int i = 0; i < a[1].length; i++) { // A열 현황 출력
                        System.out.print(" " + a[1][i]);
                    }
                    System.out.print("\n이름>>");
                    name = scanner.next();
                    do {
                        System.out.print("번호>>");
                        where = scanner.nextInt();
                    } while (where > 10 || where < 1); // 위와 마찬가지
                    a[1][where-1] = name;
                    break;
                case 3: // B열
                    System.out.print("B>>");
                    for (int i = 0; i < a[2].length; i++) { // B열 현황 출력
                        System.out.print(" " + a[2][i]);
                    }
                    System.out.print("\n이름>>");
                    name = scanner.next();
                    do {
                        System.out.print("번호>>");
                        where = scanner.nextInt();
                    } while (where > 10 || where < 1); // 위와 마찬가지
                    a[2][where-1] = name;
                    break;
                default: // 1~3 이외의 수를 입력받으면 안내메시지 출력
                    System.out.println("1~3 이외의 수를 입력하셨습니다. 다시 실행해주세요.");
                    return;
            }
        }
        catch(InputMismatchException e){ // 입력 형식이 틀릴 경우 안내메시지 출력
            System.out.println("잘못된 형식을 입력하셨습니다.");
        }
    }

    static void check(String[][] a){ // 2. 조회 메소드
        System.out.print("S>>");
        for(int i=0; i<a[0].length; i++){
            System.out.print(" " + a[0][i]);
        }
        System.out.println();

        System.out.print("A>>");
        for(int i=0; i<a[1].length; i++){
            System.out.print(" " + a[1][i]);
        }
        System.out.println();

        System.out.print("B>>");
        for(int i=0; i<a[2].length; i++){
            System.out.print(" " + a[2][i]);
        }
        System.out.println();
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    static void cancel(String[][] a){ // 3. 예약 취소 메소드
        Scanner scanner = new Scanner(System.in);
        System.out.print("좌석 S:1, A:2, B:3>>");
        try{
            int num = scanner.nextInt();
            String name;
            switch (num){
                case 1: // S열
                    System.out.print("S>>"); 
                    for(int i=0; i<a[0].length; i++){ // S열 현황 출력
                        System.out.print(" " + a[0][i]);
                    }
                    System.out.print("\n이름>>");
                    name = scanner.next(); // 이름을 입력받아 취소함
                    for(int i=0; i<a[0].length; i++){ // 이름이 예약자 명단에 있는지 확인
                        if (a[0][i].equals(name)) { // 있으면 해당 자리를 "---"로 바꿈
                            a[0][i] = "---";
                            return;
                        }
                        else if(i==a[0].length-1){ // 마지막까지 없으면 없다는 문구 출력
                            System.out.println(name+"은 예약자 목록에 없습니다.");
                        }
                    }
                    break;
                case 2: // A열
                    System.out.print("A>>");
                    for(int i=0; i<a[1].length; i++){
                        System.out.print(" " + a[1][i]);
                    }
                    System.out.print("\n이름>>");
                    name = scanner.next();
                    for(int i=0; i<a[1].length; i++){
                        if (a[1][i].equals(name)) {
                            a[1][i] = "---";
                            return;
                        }
                        else if(i==a[1].length-1){
                            System.out.println(name+"은 예약자 목록에 없습니다.");
                        }
                    }
                    break;
                case 3: // B열
                    System.out.print("B>>");
                    for(int i=0; i<a[2].length; i++){
                        System.out.print(" " + a[2][i]);
                    }
                    System.out.print("\n이름>>");
                    name = scanner.next();
                    for(int i=0; i<a[2].length; i++){
                        if (a[2][i].equals(name)) {
                            a[2][i] = "---";
                            return;
                        }
                        else if(i==a[2].length-1){
                            System.out.println(name+"은 예약자 목록에 없습니다.");
                        }
                    }
                    break;
                default:
                    System.out.println("1~3 이외의 수를 입력하셨습니다. 다시 실행해주세요.");
                    return;
            }
        }
        catch(InputMismatchException e){ // try-catch로 잘못 입력된 형식 체크
            System.out.println("잘못된 형식을 입력하셨습니다.");
        }
    }

}


