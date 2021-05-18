public class Rectangle_4 {
    private int x_position; // x위치
    private int y_position; // y위치
    private int width; // 가로
    private int height; // 세로

    Rectangle_4(int x_position, int y_position, int width, int height) { // 생성자
        this.x_position = x_position;
        this.y_position = y_position;
        this.width = width;
        this.height = height;
    }

    int square(){
        // 사각형 넓이 리턴
        return width*height;
    }

    void show(){
        System.out.println("("+x_position+","+y_position+")에서 크기가 "+width+ "x"+height+"인 사각형");
        //사각형의 좌표와 넓이를 화면에 출력
    }

    boolean contains(Rectangle_4 r){
        if((x_position<r.x_position && y_position<r.x_position) &&
                (width+x_position>r.width+r.x_position) && (height+y_position>r.height+r.y_position)){
            // r이 현 사각형 안에 있으려면 
            // 1. r의 x, y 좌표값이 현 사각형의 좌표값보다 커야함
            // 2. 현 사각형의 가로 + x값 한게 r의 가로 + x값 한거보다 커야함
            // 3. 현 사각형의 세로 + y값 한게 r의 세로 + y값 한거보다 커야함
            return true;
        }
        else{
            return false;
        }
        //매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
    }

    public static void main(String[] args) {
        Rectangle_4 r = new Rectangle_4(2, 2, 8, 7);
        Rectangle_4 s = new Rectangle_4(5, 5, 6, 6);
        Rectangle_4 t = new Rectangle_4(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)){
            System.out.println("t는 r을 포함합니다.");
        }
        if(t.contains(s)){
            System.out.println("t는 s를 포함합니다.");
        }
    }
}
