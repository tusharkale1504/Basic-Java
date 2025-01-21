import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args){
        System.out.println("White loop will be here");
        int item = 0;
        while (item<10){
            item++;
        }
        System.out.println(item);


        System.out.println("Please enter max value of loop");
        Scanner scan = new Scanner(System.in);
        int maxData = scan.nextInt();

        int data = 1;
        while(data<maxData){
            data++;
    //            System.out.println(
    //                    data
    //            );

            if(data%2==0){
                System.out.println(data);
            }
        }
    }
}
