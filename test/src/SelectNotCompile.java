public class SelectNotCompile {
    public static void main(String[] args){
        short a =0x7f_ff;
        //short b= 0x8f_ff;
        int c=0xff_ff_ff_ff;
        //int d=0xff_ff_ff_ffL;
        long e=0xff_ff_ffL;

        System.out.println(a);
        //System.out.println(b);
        System.out.println(0xff_ff_ff_ff);
        System.out.println(0x7f_ff_ff_ff);
        System.out.println(0xff_ff_ffL);


        System.out.println(!((!true||true)&&false));
        //System.out.println(1=2);
        System.out.println((double)1/4);
        System.out.println(12+23+"45");
    }
}
