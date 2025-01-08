class Persons{
//    String name = "Tushar Kale";
//    String city = "Pune";
 static   int counter = 0;

    void getCounter(){
        counter++;
        System.out.println(counter);
    }
}


public class StaticVariableExample {
    public static void main(String[] args){
        Persons p1 = new Persons();
        Persons p2 = new Persons();

        p1.getCounter();
        p2.getCounter();
    }
}
