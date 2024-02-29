import java.util.Arrays;

public class Program3 {

        public Program3() {
        }
        public static String[] removeDups(String[] arr1) {
            String s = "";
            for(int i = 0; i < arr1.length; ++i) {
                if (!s.contains(arr1[i])) {
                    s = s + arr1[i] + ",";
                }
            }
            return s.split(",");
        }
        public static void main(String[] arg) {
            System.out.print(Arrays.toString(removeDups(new String[]{"horse", "dog", "cat", "horse", "dog"})));
        }
    }



