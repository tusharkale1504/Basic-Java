public class ClassAndObjectExample {
    public static void main(String[] args){
        System.out.println("ClassAndObjectExample");
        Employee emp1 = new Employee();
        System.out.println(emp1.name);
        String empName = emp1.getName();
        System.out.println(empName);
        emp1.printName();
    }
}


class Employee{
    String name= "Tushar Kale";
    String getName(){
        return this.name;
    }

    void printName(){
        System.out.println(this.name);
    }
}
