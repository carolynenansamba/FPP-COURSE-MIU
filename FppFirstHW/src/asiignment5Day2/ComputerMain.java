package asiignment5Day2;
 public class ComputerMain {

        public static void main(String[] args) {
            Computer c1 = new Computer("Microsoft","i5",16,23);
            Computer c2 = new Computer("Dell","i6",8,123);
            Computer c3 = new Computer("Microsoft","i5",16,23);
            System.out.println(c1.equals(c2));
            System.out.println(c1.equals(c3));
            System.out.println(c1.hashCode());
            System.out.println(c2.hashCode());
            System.out.println(c3.hashCode());
        }
    }

