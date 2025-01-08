class Personsss{
   static class PersonDetails{

       void getInnerDetails(){
           System.out.println("Inner function called");
       }
   }

}

public class StaticClassExample {
    public static void main(String[] args) {
        Personsss.PersonDetails pInner= new Personsss.PersonDetails();
pInner.getInnerDetails();

    }
}
