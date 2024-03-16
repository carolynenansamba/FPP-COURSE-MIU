package pastPapers;

public class NestedStatic {
    public static void main(String[] args) {
        new MyClass().doSomething();
    }
    public static class MyClass implements MyInterface{
        @Override
        public void doSomething(){
            System.out.println("static nested class");
        }
    }
}
