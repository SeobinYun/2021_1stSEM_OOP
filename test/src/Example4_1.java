public class Example4_1 {
    int radius;
    String name;

    public Example4_1(){};

    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args){
        Example4_1 pizza;
        pizza = new Example4_1();
        pizza.radius=10;
        pizza.name="자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name +"의 면적은 " +area);

        Example4_1 donut = new Example4_1();
        donut.radius=2;
        donut.name="자바도넛";
        area=donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);


    }
}
