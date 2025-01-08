class College{
        class Student{
        void getStudentDetails(){
         System.out.println("Here is student details");
          }
        }
        void getDetails(){
            Student s1 = new Student();
            s1.getStudentDetails();
    }
}
public class NestedClassExample {
    public static void main(String[] args) {
College c1 = new College();
c1.getDetails();
    }
}



