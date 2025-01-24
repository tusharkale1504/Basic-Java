public class ThrowThrowsExample {
    public static void main(String[] args) {
//        Throw
//        try{
//            int a = 10;
//            System.out.println(10/2);
//            if(a==10){
//                System.out.println("Hello");
//                throw new ArithmeticException("test");
//            }
//        }catch(ArithmeticException e){
//            System.out.println("Some errors"+e);
//        }



        try{
checkAge();
        }catch(ArithmeticException e){
            System.out.println("Some error"+e);
        }


    }

    public static void checkAge() throws ArithmeticException{
        System.out.println(18/2);
    }

}
