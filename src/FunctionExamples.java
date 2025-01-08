public class FunctionExamples {
    public static void main(String[] args){
//       SayHello();
        int anil = 20;
        int sam = 30;
        getDaysFromAge(anil);
        getDaysFromAge(sam);
    }

    public static void SayHello(){
        System.out.println("Hello From function");
    }

    public static void getDaysFromAge(int age){
        System.out.print("User age is :");
        System.out.println(age*365);
    }
}
