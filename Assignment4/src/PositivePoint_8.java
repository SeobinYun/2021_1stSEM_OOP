public class PositivePoint_8 extends Point {
    PositivePoint_8() { // PositivePoint_8의 생성자1
        super(0, 0); // parameter를 받지 않으면 0,0을 super class의 생성자로 넘겨준다.
    }

    PositivePoint_8(int x, int y) { // PositivePoint_8의 생성자2
        super(x, y); // 우선 super()는 맨 첫줄에 써야하므로 첫줄에 super(x,y)를 실행시킨다.
        if (x < 0 || y < 0) { // 이때 x나 y 둘 중 하나가 음수이면
            super.move(0, 0); // super class의 move 메소드를 불러 0,0으로 이동시킨다.
        }
    }

    protected void move(int x, int y) {
        if (x > 0 && y > 0) { // x와 y가 0 이상이면 super class의 move 메소드를 실행한다.
            super.move(x, y);
        }
    }

    public String toString() { // x, y 좌표를 Point class의 getX(), getY() 메소드를 사용해 리턴한다.
        return "(" + getX() + "," + getY() + ")의 점";
    }

    public static void main(String[] args) {
        PositivePoint_8 p = new PositivePoint_8();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, -5);
        System.out.println(p.toString() + "입니다.");

        PositivePoint_8 p2 = new PositivePoint_8(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}