import org.w3c.dom.ls.LSOutput;

public class P9 {
    public static void main(String[] args) {
        int x = 3;
        A a = new A();
        System.out.println(x);
        x = 4;
        a.a = 5;
        System.out.println(a.a);
        A.print(x, a);

        System.out.println(x);
        System.out.println(a.a);
    }
}

    class A{
        int a;
        static void print(int y, A a){
            y+=1;
            System.out.println(y);
            a.a=y+2;
            System.out.println(a.a);
            a = new A();
            a.a=y;
            System.out.println(a.a);
        }
    }

