class People{
    People(){
        System.out.println("Constructor called");
    }

    People(String name){
        System.out.println(name);
    }
    People(String name, int age){
        System.out.println(name +age);
    }
}


public class MakeTwoConstructor {
    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People("Tushar");
        People p3 = new People("Tushar" , 21);

    }
}
