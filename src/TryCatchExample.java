public class TryCatchExample {


    public static void main(String[] args) {
        int a = 10;
       try{
           System.out.println(10/2);
       }catch (Exception error){
           System.out.println("You can not divide by zero");
       }finally {
           System.out.println("This block run in both cases");
       }

        System.out.println("HELLO NEXT CODE");
    }

}
