public class ClassExample {

    public static void main(String[] args){
        User u1 = new User();
       u1.getData();
       u1.name="Sam";

        System.out.println("Hello Class");
    }
}

 class User{
    public int data = 10;
    public String name = "Tushar";
    public  void getData(){
        System.out.println("get data");
    }
}
