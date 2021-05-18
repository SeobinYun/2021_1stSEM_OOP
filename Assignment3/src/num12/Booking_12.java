package num12;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Booking_12 {
    public static void main(String[] args){
        String[] S = {"---","---","---","---","---","---","---","---","---","---"};
        String[] A = {"---","---","---","---","---","---","---","---","---","---"};
        String[] B = {"---","---","---","---","---","---","---","---","---","---"};
        String[][] array = {S,A,B};

        Scanner scanner = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            try {
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        reservation(array);
                        break;
                    case 2:
                        check(array);
                        break;
                    case 3:
                        cancel(array);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("1~4 이외의 수를 입력하셨습니다. 다시 실행해주세요.");
                }
            }
            catch (InputMismatchException e){
                System.out.println("잘못된 형식을 입력하셨습니다.");
            }
        }
    }

    static void reservation(String[][] a){
        Scanner scanner = new Scanner(System.in);
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        try {
            int num = scanner.nextInt();
            String name;
            int where;
            switch (num) {
                case 1:
                    System.out.print("S>>");
                    for (int i = 0; i < a[0].length; i++) {
                        System.out.print(" " + a[0][i]);
                    }
                    System.out.print("\n이름>>");
                    name = scanner.next();
                    do {
                        System.out.print("번호>>");
                        where = scanner.nextInt();
                    } while (where > 10 || where < 1);

                    a[0][where-1] = name;
                    break;
                case 2:
                    System.out.print("A>>");
                    for (int i = 0; i < a[1].length; i++) {
                        System.out.print(" " + a[1][i]);
                    }
                    System.out.print("\n이름>>");
                    name = scanner.next();
                    do {
                        System.out.print("번호>>");
                        where = scanner.nextInt();
                    } while (where > 10 || where < 1);
                    a[1][where-1] = name;
                    break;
                case 3:
                    System.out.print("B>>");
                    for (int i = 0; i < a[2].length; i++) {
                        System.out.print(" " + a[2][i]);
                    }
                    System.out.print("\n이름>>");
                    name = scanner.next();
                    do {
                        System.out.print("번호>>");
                        where = scanner.nextInt();
                    } while (where > 10 || where < 1);
                    a[2][where-1] = name;
                    break;
                default:
                    System.out.println("1~3 이외의 수를 입력하셨습니다. 다시 실행해주세요.");
                    return;
            }
        }
        catch(InputMismatchException e){
            System.out.println("잘못된 형식을 입력하셨습니다.");
        }
    }

    static void check(String[][] a){
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

    static void cancel(String[][] a){
        Scanner scanner = new Scanner(System.in);
        System.out.print("좌석 S:1, A:2, B:3>>");
        try{
            int num = scanner.nextInt();
            String name;
            switch (num){
                case 1:
                    System.out.print("S>>");
                    for(int i=0; i<a[0].length; i++){
                        System.out.print(" " + a[0][i]);
                    }
                    System.out.print("\n이름>>");
                    name = scanner.next();
                    for(int i=0; i<a[0].length; i++){
                        if (a[0][i].equals(name)) {
                            a[0][i] = "---";
                            return;
                        }
                        else if(i==a[0].length-1){
                            System.out.println(name+"은 예약자 목록에 없습니다.");
                        }
                    }
                    break;
                case 2:
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
                case 3:
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
        catch(InputMismatchException e){
            System.out.println("잘못된 형식을 입력하셨습니다.");
        }
    }

}


