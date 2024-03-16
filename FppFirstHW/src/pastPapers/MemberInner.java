package pastPapers;

public class MemberInner {
    public static void main(String[] args) {
        MemberInner m = new MemberInner();
        m.new MyClass().doSomething();
    }
     class MyClass implements MyInterface{
        public void doSomething(){
            System.out.println("MemberClass");
        }
     }
}
