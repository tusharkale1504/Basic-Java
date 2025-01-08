import org.w3c.dom.ls.LSOutput;

class Engine{

void start(){
    String name = "V8";
    System.out.println("Engine Started");
}

void repairEngines(){
    System.out.println("Engine working fine now");
}
}

class Car extends Engine{
void start(String data){
    System.out.println("Own start function called");
}
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
Car c1 = new Car();
//c1.start();
c1.start("Hello");
c1.repairEngines();

    }
}
