import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args)  {
      try{
          File fileObj = new File("appleW.txt");
          Scanner reader = new Scanner(fileObj);
          while (reader.hasNextLine()){
              String data = reader.nextLine();
              System.out.println(data);
          }
      }catch (Exception e) {
          System.out.println("Some error"+ e);
      }
      }
    }
