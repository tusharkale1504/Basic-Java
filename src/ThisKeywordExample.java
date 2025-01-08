class Peoples{
    String name ="Tushar Kale";

    Peoples(){
        this.getData();
    }
    Peoples(String data){
this();
    }



    void getData(){
        System.out.println(this.name);
    }


//    static void getInfo(){
//        System.out.println();
//    }

}


public class ThisKeywordExample {
    public static void main(String[] args) {
       Peoples p1=new Peoples();
//        System.out.println(p1.name);


    }
}
