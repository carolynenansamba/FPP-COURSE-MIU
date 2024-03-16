package pastPapers;

public class LamdaExample {
    public static void main(String[] args) {
        MyInterface m= () -> System.out.println("Lamda Expression");
        m.doSomething();
    }
}
