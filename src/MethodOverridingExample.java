
class Userss{
  void  getLogin(){
        System.out.println("User Login");
    }
}

class Empl extends Userss{
void getLogin(){
    System.out.println("Emp login");
}
}

public class MethodOverridingExample {
    public static void main(String[] args) {
Empl e1 = new Empl();
e1.getLogin();
    }
}
