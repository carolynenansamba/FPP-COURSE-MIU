package inclassExerciseDay5;

public class Assignment4Qtn3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arraySum(arr, arr.length));
    }

        public static int arraySum(int[] arr, int n) {
            if (n == 0) {
                return 0;
            } else {
                return arr[n - 1] + arraySum(arr, n - 1);
            }
        }


    }


