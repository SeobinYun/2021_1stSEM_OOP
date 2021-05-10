public class s2 {
    public static void main(String[] args){
        A1 a= new A1();
        a.f(1,2);
        a.f(10000,20000);
        A2 b=new A2();
        b.f(2.5,10000);

    }
}

class A1{
    void f(double a, double b){
        System.out.println("d d");
    }

    void f(byte a, byte b){
        System.out.println("b b");
    }
}

class A2{
    void f(double a, double b){
        System.out.println("d d");
    }

    void f(float a, int b){
        System.out.println("f i");
    }
}
