public class Program6 {
    public static void main(String[] args) {
        int[] result;
        System.out.println(min(result = new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22}));
    }

    public static int min(int[] arrayOfInts) {

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < minValue) {
                minValue = arrayOfInts[i];
            }
        }
        return minValue;
    }
}
