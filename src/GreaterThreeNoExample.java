import java.util.Scanner;

public class GreaterThreeNoExample{
    static void check(){
        Scanner scan = new Scanner(System.in);
        int  num1 = scan.nextInt();
        int  num2 = scan.nextInt();
        int  num3 = scan.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+ " is gretest");}
        else if(num2>num3 && num2>num1){
            System.out.println(num2+ " is gretest");
        }
        else if(num3>num1 && num3>num2){
            System.out.println(num3+ " is gretest");
        }
        else{
            System.out.println("Both are same");
        }
    }
    public static void main(String[] args){
        GreaterThreeNoExample obj1 = new GreaterThreeNoExample();
        obj1.check();
    }

}