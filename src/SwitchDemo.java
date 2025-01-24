import java.util.Scanner;

public class SwitchDemo {
 void sum(int a, int b){
     System.out.println(a+b);
 }

    void sub(int a, int b){
        System.out.println(a-b);
    }

    void mult(int a, int b){
        System.out.println(a*b);
    }

    void div(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        int y= scan.nextInt();


        SwitchDemo obj = new SwitchDemo();

        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");



        int choice= scan.nextInt();

        System.out.println("\nChoice ="+choice);

        switch (choice){
            case 1:obj.sum(x,y);
            break;

            case 2:obj.sub(x,y);
                break;

            case 3:obj.mult(x,y);
                break;

            case 4:obj.div(x,y);
                break;
        }
    }
}
