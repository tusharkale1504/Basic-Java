abstract class Android{
void goodFeatures(){
    System.out.println("Android OS provides a lot of good features");
}

abstract void makeYourUI();


}

class AnySmartPhone extends Android{
void makeYourUI(){
    System.out.println("Smartphone company has own UI");
}
}

public class AbstractClassExample {
    public static void main(String[] args) {
AnySmartPhone a1 = new AnySmartPhone();
a1.makeYourUI();
a1.goodFeatures();


    }
}
