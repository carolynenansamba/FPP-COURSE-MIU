
public class Program1 {
        public static void main(String[] args) {
            // 1. Generate a random number x in the range 1..9 and compute πx
         int x = RandomNumbers.getRandomInt(1,9);
            // 2. Generate a random number y in the range 3..14 and compute yπ
            int y = RandomNumbers.getRandomInt(3,14);
            System.out.println(Math.pow(Math.PI,(double)x));
            System.out.println(Math.pow((double)y, Math.PI));
        }
    }


