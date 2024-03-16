package inclassExerciseday4;

public class OrderOfExecution {
    OrderOfExecution(int x){
        System.out.println("One argument constructor");
    }
    OrderOfExecution(){
        System.out.println("No argument constructor");
    }
    static{
        System.out.println("1st static init");
    }
    {
        System.out.println("1st instance init");
    }
    static{
        System.out.println("2nd static init");
    }

    {
        System.out.println("2nd instance init");
    }
    public static void main(String [] args){
        new OrderOfExecution();
        new OrderOfExecution(8);
    }
}
