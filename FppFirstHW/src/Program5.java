public class Program5 {
    public static void main(String[] args){
        Program5 program = new Program5();

        // Example arrays
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};

        int[] combined = program.combine(a, b);// Call the combine method


        // Print the combined array
        for (int num : combined) {
            System.out.print(num + " ");
        }

    }
    public int[] combine(int[] a, int[] b){
        int[] result = new int [a.length + b.length];
        System.arraycopy(a,0,result,0,a.length);
        System.arraycopy(b,0,result,a.length,b.length);


        return result;
    }
}
