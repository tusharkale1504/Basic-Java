
class Personss{

    void getData(){
//    Personss p1 = new Personss();
    testStatic();

    }

    static void testStatic(){
        System.out.println("Test Static Function");
    }
}

public class StaticMethod {
    public static void main(String[] args){

        Personss p1 = new Personss();
        p1.getData();
        p1.testStatic();


    }
}
