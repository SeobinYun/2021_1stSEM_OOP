import java.util.Scanner;

public class SquareCrush_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();

        if(((x1>=100 && x1<=200) && (y1>=100 && y1<=200)) || ((x2>=100&& x2<=200) && (y2>=100 && y2<=200))){
            // 한 좌표라도 (100, 100), (200, 200) 안에 존재하면 겹쳐버리기 때문에 '||' 연산자 사용
            System.out.println("입력받은 직사각형은 (100, 100), (200, 200)의 두 점으로 이루어진 사각형과 충돌합니다.");
        }
        else{
            System.out.println("입력받은 직사각형은 (100, 100), (200, 200)의 두 점으로 이루어진 사각형과 충돌하지 않습니다.");
        }

        scanner.close();

    }
}
