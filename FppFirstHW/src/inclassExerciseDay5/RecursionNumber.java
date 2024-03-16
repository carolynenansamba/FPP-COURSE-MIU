package inclassExerciseDay5;

public class RecursionNumber {

    public static void main(String[] args) {
        countDown(3);

    }

    public static void countDown(int num) {
        if (num <= 0) {
            System.out.println("yes");

        } else {
            System.out.println(num);
            countDown(num - 1);
            System.out.println("Never called");
        }
        System.out.println("something");
    }
}