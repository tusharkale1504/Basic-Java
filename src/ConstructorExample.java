class Person{
    String name;

    Person(String data){
        System.out.println(data);
    }
}

public class ConstructorExample {
    public static void main(String[] args){

        Person person1 = new Person("Tushar Kale");
        Person person2 = new Person("Sam");
        Person person3 = new Person("Kale");


    }
}
