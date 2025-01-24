import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {

    public static void main(String[] args) throws IOException {
//        File myFile = new File("testfile.txt");
//
//        if (myFile.createNewFile()){
//            System.out.println("File has created");
//        }else{
//            System.out.println("File already exist");
//        }
//    }

        try {
            FileWriter myFW = new FileWriter("appleW.txt");
            myFW.write("This is a apple text file");
            myFW.close();
        } catch (Exception e) {
            System.out.println("Some error occurred"+e);
        }
    }
}