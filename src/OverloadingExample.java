class Emp{

    Emp(){
        System.out.println("Constructor without arguments");
    }

    Emp(String data){
        System.out.println(data);
    }


  void  getName(){
      System.out.println("Get name method without arguments");
    }

    void  getName(String name){
        System.out.println(name);
    }


    void  getName(String fName,String lName){
        System.out.println(fName + lName);
    }

    void getAge(int age){
        System.out.println("int age"+ age);
    }


    void getAge(String age){
        System.out.println("String age"+ age);
    }
}


public class OverloadingExample {
    public static void main(String[] args) {
Emp e1 = new Emp();
e1.getName();
e1.getName("Tushar" , "Kale");
e1.getAge("20");
    }
}
