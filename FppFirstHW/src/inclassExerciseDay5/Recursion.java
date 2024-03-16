package inclassExerciseDay5;

public class Recursion {
    public static void main(String [] args){
//        len("ORANGE");
//        System.out.println("End of main method");
//        printCharsReverse("APPLE");
        fact(3);
        //System.out.println(factorial);
        System.out.println("Ed of main method");

    }

    public static int fact(int num){
        if(num==1 ||  num == 0){
            return 1;
        }
        int sum = num*fact(num-1);
        System.out.println(sum);
        return sum;

    }

    public static int len(String str) {
        if (str == null || str.equals(" ")) {
            return 0;
        } else {
            int sum = 1 + len(str.substring(1));
            return sum;
        }

    }
    public static void printCharsReverse(String str){
        if(str == null || str.equals(" ")){
            return ;
        }else{
            printCharsReverse(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }
}
