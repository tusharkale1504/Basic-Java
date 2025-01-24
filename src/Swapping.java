
public class Swapping{



    static void swap(int x, int y){
int a = x;
x=y;
y=a;

        System.out.println("x:"+x);
        System.out.println("y:"+y);

    }

    public static void main(String []args){
        Swapping obj1 = new Swapping();

        obj1.swap(10,20);
    }
}