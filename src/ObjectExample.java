public class ObjectExample {

    public static void main(String[] args){
       Student s1 = new Student();
        System.out.println(s1.getName());
    }
}


class Student{
    int defaultAge = 18;
   String getName(){
        return "Tushar Kale";
    }
}
