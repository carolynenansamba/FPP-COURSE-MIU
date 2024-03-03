package Asignment5Qtn1;

public class MainClass {
    public static void main(String[] args) {
        Shape []   shapes = new Shape[5];
        Circle c1 = new Circle("green", 12);
        shapes[0] =c1;
        Square s1 = new Square("blue", 4);
        shapes[1] = s1;
        Square s2 = new Square("pink", 6);
        shapes[2] = s2;
        Rectangle r2 = new Rectangle("brown",4,5);
        shapes[3] =r2;
        Rectangle r3 = new Rectangle("black", 5,4);
        shapes[4] =r3;

      printTotal(shapes);

    }
   public  static void printTotal(Shape[] shapes){
       double totalArea = 0.0;
       double totalPerimeter =0.0;
       for (Shape shape : shapes) {
           totalArea += shape.calculateArea();
           totalPerimeter += shape.calculatePerimeter();

       }
       System.out.println("Total Area: " + totalArea);
       System.out.println("Total Perimeter: " + totalPerimeter);
    }
}
