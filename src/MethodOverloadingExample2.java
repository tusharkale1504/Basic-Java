class Userrs{
 void getLogin(String name){
    System.out.println(name+ " User Login");
}
}

class Emplo extends Userrs{
void getLogin(int password){
    System.out.println("Child user Login");
}

}


public class MethodOverloadingExample2 {
    public static void main(String[] args) {
Emplo e1 = new Emplo();
e1.getLogin(30);
    }
}
