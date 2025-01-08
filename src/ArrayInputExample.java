import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args){
        System.out.println("Please enter total element of array");
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();
        System.out.println(totalInput);
        int inportArr[]= new int[totalInput];
        System.out.println("Please enter array element values");
        for(int i=0;i<totalInput;i++){
            inportArr[i]= scan.nextInt();
        }

        System.out.println("Array elements are here");
        for (int i =0;i<totalInput;i++){
            System.out.println(inportArr[i]);
        }
    }
}
