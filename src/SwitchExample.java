import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args){
        System.out.println();
//        int age= 10;

        Scanner scan = new Scanner(System.in);
        int age=scan.nextInt();


        switch (age){
            case 10 :
                System.out.println("The age is 10");
                break;

            case 20 :
                System.out.println("The age is 20");
                break;

            case 30 :
                System.out.println("The age is 30");
                break;

            case 40 :
                System.out.println("The age is 40");
                break;

            default:
                System.out.println("User age is not matching in any case");
        }
    }


}
