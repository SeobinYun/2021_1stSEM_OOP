public class Rectangle_4 {
    private int x_position;
    private int y_position;
    private int width;
    private int height;

    Rectangle_4(int x_position, int y_position, int width, int height) {
        this.x_position = x_position;
        this.y_position = y_position;
        this.width = width;
        this.height = height;
    }

    int square(){
        // 사각형 넓이 리턴
        return this.width*this.height;
    }

    void show(){
        System.out.println("("+this.x_position+","+this.y_position+")에서 크기가 "+this.width+ "x"+this.height+"인 사각형");
        //사각형의 좌표와 넓이를 화면에 출력
    }

    boolean contains(Rectangle_4 r){
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
