class Parent{
    String name = "Tushar";
    void getData(){
        System.out.println(this.name);

    }
}

class Child extends Parent{

}



public class InheritanceExample {
    public static void main(String[] args) {
Child c1 = new Child();
c1.getData();
    }
}
