package InterfacesAgain;

public class Test {
    public static void main(String[] args) {
        SquarePerimeter sp = (side1,side2,side3,side4) -> side1 +side2 +side3 +side4;
        System.out.println(sp.calcPerimeter(2,2,2,2));

        SquarePerimeter2 sp2 = (side) -> side*4;
        System.out.println(sp2.calculatePerimeter(4));

        FavourateColor color = () -> "Red";
        System.out.println(color.color1());

        Capitalise c = a -> Character.toUpperCase(a);
//        c.toCapital('a');

       // Capitalise c = a -> (a);
        System.out.println(c.toCapital('d'));


    }

}
