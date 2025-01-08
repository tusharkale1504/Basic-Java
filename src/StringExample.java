public class StringExample {
    public static void main(String[] args){
   String str="Hello this is second class";
        System.out.println(str.length());
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,10));
        System.out.println(str.replace("Hello","Hii"));
        System.out.println(str.isEmpty());

        char[] chArray={'T','U','S','H','A','R' };
        String  str2= new String(chArray);
        System.out.println(str2);
    }
}
