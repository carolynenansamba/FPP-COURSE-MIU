package abstractClasses;

public abstract class MyAbstract {
    private static int staticVariable;
    private int instanceVariable;

    MyAbstract(int value){
        this.instanceVariable = value;

    }
    public void instanceMethod(){
        System.out.println("My instance method");
    }

    public abstract void abstractMethod();
}
