public class ObjectExamples {


public static void main(String[] args){
    Students s1 = new Students();
    System.out.println();

    s1.displayName();
    System.out.println(s1.defaultAge);

    Teacher t1 = new Teacher();
    String tName = "Sam";
    t1.displayName(tName);
}

}


class  Students {
    int defaultAge=18;
    String getName(){
        return "Tushar Kale";
    }
void displayName(){
    System.out.println("Tushar kale in display function");
}
}


class Teacher{
    void displayName(String name){
        System.out.println(name);
    }
}





