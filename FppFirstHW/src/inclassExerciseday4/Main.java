package inclassExerciseday4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "Carol has here, With me's late.?";
        String[] array = s.split(" |, |\'|\\.|\\?");
        System.out.println(Arrays.toString(array));
    }
}
