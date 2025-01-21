class Userrr{
    Userrr   login(){
        System.out.println("Login in User");
        return this;
    }
}


class Client extends Userrr{

    @Override
    Client  login() {
         System.out.println("Client login");
         return this;
    }
}

public class CovirantExample {

    public static void main(String[] args) {
Client c1 = new Client();
c1.login();
    }
}
