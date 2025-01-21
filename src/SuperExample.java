class Animal{

    Animal(){
        System.out.println("Animal constructor");
    }

    int age =20;
    void sleep(){

        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal{
    Dog(){
        super();
    }

void doSomething(){
    super.sleep();
    System.out.println(super.age);
}
}

public class SuperExample {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.doSomething();
    }
}
