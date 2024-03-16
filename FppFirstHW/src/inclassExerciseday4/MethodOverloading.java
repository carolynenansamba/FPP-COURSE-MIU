package inclassExerciseday4;
/*
Changing the signature of methods
1.The number of parameters in two methods.
2.The data types of the parameters of methods.
3.The Order of the parameters of methods.
You can change the return type of a method along
with the method signature
 */
public class MethodOverloading {
    public static void main(String [] args){

    }
    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public int add(int a,int b, int c){
        int sum = a+b+ c;
        return sum;

    }
    public double add(double a,double b, double c){
         double sum = a+b+ c;
        return sum;

    }
    public double add(int a,double b){
        double sum = a+b;
        return sum;

    }
    public double add(double b,double a){
        double sum = a+b;
        return sum;

    }

}
