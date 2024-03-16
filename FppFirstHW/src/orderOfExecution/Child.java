package orderOfExecution;

public class Child extends Parent {
    static String str;
    String instancestr;

    static {
        str = "Hello world";
        System.out.println("child instance block str = " + str);
    }

    {
        instancestr = "hi";
        System.out.println("chils instance block str = " + instancestr);
    }

    ///////////////////////////////////////////
    Child(String s) {
        super(100);
        instancestr = s;
        System.out.println("child constructor instancestr " + instancestr);
    }
}
