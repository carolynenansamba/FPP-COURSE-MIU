package inclassExerciseDay5;

public class Assignment4Qtn1 {
    public static void main(String[] args) {
         reverseDigit(123);
    }
    public static void reverseDigit(int n){
        if(n==0){
            System.out.println( " ");
        }else{
            System.out.print( n%10);
            reverseDigit(n/10);
        }
    }
}
