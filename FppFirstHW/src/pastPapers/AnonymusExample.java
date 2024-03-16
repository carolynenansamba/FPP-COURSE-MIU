package pastPapers;

public class AnonymusExample {
    public static void main(String[] args) {


        MyInterface m = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Hi");
            }
        };
        m.doSomething();
    }
}
