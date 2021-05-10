public class P12  extends A_1{
    String a="망";
    String b="헀";
    String c="다";

    void write(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        super.write();
    }
    public static void main(String[] args){
        A_1 aa= new P12();
        aa.write();
    }
}

class A_1{
    protected int a=50;
    private int b=100;
    static String c= "c발";

    void write(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
