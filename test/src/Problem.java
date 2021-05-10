class Animal{
    static void shout(){
        System.out.println("shout Animal");
    }

    void walk(){
        System.out.println("walk Animal");
    }
}

class Cat extends Animal{
    static void shout(){
        System.out.println("shout Cat");
    }

    void walk(){
        System.out.println("walk Cat");
    }
}

public class Problem {
    public static void main(String[] args){
        Animal animal = new Cat();
        Cat cat = new Cat();
        animal.shout();
        cat.shout();
        animal.walk();
        cat.walk();

    }
}
