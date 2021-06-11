//interface l1 extends l2 { void f(); }
//interface l2{ default void f() { System.out.println("f() in l2");} }
//interface l3 { void f(); }
//interface l4 { static void f() { System.out.println("f() in l4");} }
//abstract class AC1 { void f() {System.out.println("f() in AC");} }
//abstract class AC2 { abstract void f(); }
//class C1 extends AC1 implements l1,l3,l4 {
//    public void f() {
// AC1.f();
//        System.out.println("f() in C");}
//}
//    class C2 extends AC2 implements l2,l3,l4 {
//public void f() {
//        ⓑ;
//        ⓒ;
//        System.out.println("f() in C");}
//        }
//        public class interfaceTest {
//            public static void main(String[] args) {
//                l2 object1 = new C1();
//                object1.f();
//                l3 object2 = new C2();
//                object2.f();
//            }
//        }
