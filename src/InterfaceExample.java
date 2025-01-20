import org.w3c.dom.ls.LSOutput;

interface driving{
    String name = "any Car";
void startEngine();
void applyBreak();


}

class Cars implements driving{

    String name = "Altroz";
   public void startEngine(){

        System.out.println("Engine Started");
    }

    public void applyBreak(){
        System.out.println("Break applied");
    }

    void changeGear(){
        System.out.println("Change gear");
    }

}


public class InterfaceExample {
    public static void main(String[] args) {
Cars c1 = new Cars();
c1.startEngine();
        System.out.println(c1.name);
        c1.changeGear();
    }
}
