class Users{
    void getLogin(){
        System.out.println("User logged in");
    }
}


class StudentUsers extends Users{
String name = "Peter";
 void getMarks(){
    System.out.println("All marks printed");
}


}

class TeacherUsers extends Users{
    String name = "Bruce";
    void getSkills(){
        System.out.println("All skills printed");
    }

}

class Guards extends Users{

}



public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
TeacherUsers tu = new TeacherUsers();
StudentUsers su = new StudentUsers();
Guards g1 = new Guards();

su.getLogin();
tu.getLogin();
g1.getLogin();

    }
}
