import java.util.Scanner;

public class TwoDArrayWithInput {
    public static void main(String[] args){
        int d1 = 3;
        int d2 = 3;
        String str[][]= new String[d1][d2];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2D array values");
        for (int i=0;i<d1;i++){
            for(int j=0;j<d2;j++){
                str[i][j] = scan.next();
            }
        }

//        str[0][0] = "A";
//        str[0][1] = "B";
//        str[0][2] = "C";
//
//        str[1][0] = "D";
//        str[1][1] = "E";
//        str[1][2] = "F";
//
//        str[2][0] = "G";
//        str[2][1] = "H";
//        str[2][2] = "I";


        for (int i=0;i<str.length;i++){
            for (int j=0;j<str[i].length;j++){
                System.out.println("I:" + i +" "+"J:"+j+"----->"+ str[i][j]);
            }
        }
    }
}
