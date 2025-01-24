//public class CalculateIntrest {
//static int interest(int p,int n , int r){
//    int interest = (p*n*r)/100;
//    return interest;
//}
//
//    public static void main(String[] args) {
//        int result = interest(1000,4,5);
//        System.out.println(result);
//    }
//}

//public class CalculateIntrest {
//    static void interest(){
//        int p,n,r;
//        p=1000;
//        n=4;
//        r=5;
//        int interest = (p*n*r)/100;
//        System.out.println(interest);
//    }
//
//    public static void main(String[] args) {
//         interest();
//
//    }
//}

//public class CalculateIntrest {
//    static void interest(int p,int n , int r){
//        int interest = (p*n*r)/100;
//        System.out.println(interest);
//    }
//    public static void main(String[] args) {
//        interest(1000,4,5);
//    }
//}



public class CalculateIntrest {
    static int interest() {
        int p, n, r;
        p = 1000;
        n = 4;
        r = 5;
        int interest = (p * n * r) / 100;
        return interest;
    }
        public static void main (String[]args){
           int result = interest();
            System.out.println(result);
    }
}
