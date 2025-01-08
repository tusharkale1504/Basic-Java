public class FunctionParams {
    public static void main(String [] args){
        int user1Age= 20;
        getAgeInDays(user1Age);

        int user2Age= 15;
        getAgeInDays(user2Age);

int amount = 1000;
int time = 1;
int rate = 12;
        CalculateIntrestRate(amount,time,rate);
    }

    public static  void getAgeInDays(int age){
//        System.out.println("Here you will find your age");
        System.out.println(age*365);
    }


    public static  void CalculateIntrestRate(int amount , int time,int rate){

        System.out.println((amount*time*rate)/100);
    }
}
