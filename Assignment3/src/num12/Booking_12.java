package num12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Booking_12 {
    private String[] S;
    private String[] A;
    private String[] B;

    public Booking_12(){
        String[] S = {"---","---","---","---","---","---","---","---","---","---"};
        //String[] S = new String[10];
        String[] A = {"---","---","---","---","---","---","---","---","---","---"};
        //String[] A = new String[10];
        String[] B = {"---","---","---","---","---","---","---","---","---","---"};
        //String[] B = new String[10];
    }

    public static void main(String[] args){
        Booking_12 ex = new Booking_12();

        for(int i=0; i<ex.S.length; i++){
            System.out.print(" " + ex.S[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        for(int i=0; i<ex.S.length; i++){
            System.out.print(" " + ex.S[i]);
        }
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    reservation(ex);
                    break;
                case 2:
                    check(ex);
                    break;
                case 3:
                    cancel(ex);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("1~4 이외의 수를 입력하셨습니다. 다시 실행해주세요.");
            }
        }
    }

    static void reservation(Booking_12 a){
        Scanner scanner = new Scanner(System.in);
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int num = scanner.nextInt();
        String name;
        int where;
        switch (num){
            case 1:
                System.out.print("S>>");
                for(int i=0; i<a.S.length; i++){
                    System.out.print(" " + a.S[i]);
                }
                System.out.print("\n이름>>");
                name = scanner.next();
                do {
                    System.out.print("번호>>");
                    where = scanner.nextInt();
                }while(where>10 || where<1);

                a.S[where] = name;
                break;
            case 2:
                System.out.print("A>>");
                for(int i=0; i<a.A.length; i++){
                    System.out.print(" " + a.A[i]);
                }
                System.out.print("\n이름>>");
                name = scanner.next();
                do {
                    System.out.print("번호>>");
                    where = scanner.nextInt();
                }while(where>10 || where<1);
                a.A[where] = name;
                break;
            case 3:
                System.out.print("B>>");
                for(int i=0; i<a.B.length; i++){
                    System.out.print(" " + a.B[i]);
                }
                System.out.print("\n이름>>");
                name = scanner.next();
                do {
                    System.out.print("번호>>");
                    where = scanner.nextInt();
                }while(where>10||where<1);
                a.B[where] = name;
                break;
            default:
                System.out.println("1~3 이외의 수를 입력하셨습니다. 다시 실행해주세요.");
                return;
        }
    }

    static void check(Booking_12 a){
        System.out.print("S>>");
        for(int i=0; i<a.S.length; i++){
            System.out.print(" " + a.S[i]);
        }
        System.out.println();

        System.out.print("A>>");
        for(int i=0; i<a.A.length; i++){
            System.out.print(" " + a.A[i]);
        }
        System.out.println();

        System.out.print("B>>");
        for(int i=0; i<a.B.length; i++){
            System.out.print(" " + a.B[i]);
        }
        System.out.println();
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    static void cancel(Booking_12 a){
        Scanner scanner = new Scanner(System.in);
        System.out.print("좌석 S:1, A:2, B:3>>");
        int num = scanner.nextInt();
        String name;
        switch (num){
            case 1:
                System.out.print("S>>");
                for(int i=0; i<a.S.length; i++){
                    System.out.print(" " + a.S[i]);
                }
                System.out.print("\n이름>>");
                name = scanner.next();
                for(int i=0; i<a.S.length; i++){
                    if (a.S[i].equals(name)) {
                        a.S[i] = "---";
                        return;
                    }
                    else if(i==a.S.length-1){
                        System.out.println(name+"은 예약자 목록에 없습니다.");
                    }
                }
                break;
            case 2:
                System.out.print("A>>");
                for(int i=0; i<a.A.length; i++){
                    System.out.print(" " + a.A[i]);
                }
                System.out.print("\n이름>>");
                name = scanner.next();
                for(int i=0; i<a.A.length; i++){
                    if (a.A[i].equals(name)) {
                        a.A[i] = "---";
                        return;
                    }
                    else if(i==a.A.length-1){
                        System.out.println(name+"은 예약자 목록에 없습니다.");
                    }
                }
                break;
            case 3:
                System.out.print("B>>");
                for(int i=0; i<a.B.length; i++){
                    System.out.print(" " + a.B[i]);
                }
                System.out.print("\n이름>>");
                name = scanner.next();
                for(int i=0; i<a.B.length; i++){
                    if (a.B[i].equals(name)) {
                        a.B[i] = "---";
                        return;
                    }
                    else if(i==a.B.length-1){
                        System.out.println(name+"은 예약자 목록에 없습니다.");
                    }
                }
                break;
            default:
                System.out.println("1~3 이외의 수를 입력하셨습니다. 다시 실행해주세요.");
                return;
        }
    }

}


