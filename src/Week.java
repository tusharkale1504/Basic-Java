import java.util.Scanner;

public class Week{
    static void check(){
        Scanner scan = new Scanner(System.in);
        int  day = scan.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedensday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }
    public static void main(String[] args){
        Week obj1 = new Week();
        obj1.check();
    }

}