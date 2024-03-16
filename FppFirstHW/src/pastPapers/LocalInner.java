package pastPapers;

public class LocalInner{
    public static void main(String[] args) {
        class MyClass implements MyInterface{
            @Override
            public void doSomething(){
                System.out.println("How are you");
            }
        }

        new MyClass().doSomething();
    }
}
