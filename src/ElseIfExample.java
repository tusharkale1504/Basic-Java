import java.util.Scanner;

public class ElseIfExample{
//    void getData(){
//
//    }
    static void data(){
        Scanner scan = new Scanner(System.in);
  int  a = scan.nextInt();
        int num = 10;
        if(a<num){
            System.out.println(a+ " is small");}
        else if(a>num){
            System.out.println(a+ " is big");
        }
        else{
            System.out.println("Both are same");
        }
    }
    public static void main(String[] args){
        ElseIfExample obj1 = new ElseIfExample();
//        obj1.getData(20);
        obj1.data();
    }

}