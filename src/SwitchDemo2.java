import java.util.Scanner;
public class SwitchDemo2 {

        void circle(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter r: ");
            int r = scan.nextInt();
            final double pi= 3.1417;
            double area= pi*r*r;
            System.out.println(area);
        }

        static void rectangle(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter l: ");
            int l = scan.nextInt();
            System.out.print("Please enter b: ");
            int b = scan.nextInt();
        int area;
        area = l*b;
        System.out.println(area);
    }

    static void square(){
        Scanner scan = new Scanner(System.in);
        int side= scan.nextInt();

        int area;
        area = side*side;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SwitchDemo2 obj = new SwitchDemo2();

        System.out.println("Menu:");
        System.out.println("1. Area of circle");
        System.out.println("2. Area of rectangle");
        System.out.println("3. Area of square");
        System.out.print("Please choose : ");
        int choice= scan.nextInt();
        System.out.println("\nChoice ="+choice);

        switch (choice){
            case 1:obj.circle();
                break;
            case 2:obj.rectangle();
                break;
            case 3:obj.square();
                break;
        }
    }
}

