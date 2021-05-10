import java.util.Scanner;
public class CircleCrush_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int radius1 = scanner.nextInt();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int radius2 = scanner.nextInt();

        if(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))<=((radius1+radius2)*(radius1+radius2))){
            // 두 원이 겹치게 된다면, 두 원의 중심 사이의 거리가 두 원의 반지름을 더한 값과 같거나 더 작아지게 된다.
            // 따라서 두 좌표 사이의 거리를 구하는 공식과 두 원의 반지름의 합을 응용함.
            System.out.println("두 원은 서로 겹친다.");
        }
        else{
            System.out.println("두 원은 서로 겹치지 않는다.");
        }

        scanner.close();
    }
}
