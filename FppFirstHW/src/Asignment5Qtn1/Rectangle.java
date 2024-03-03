package Asignment5Qtn1;

public class Rectangle extends Shape{
    int width;
    int  height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
     double calculateArea(){
        double area = width * height;
        return area;
    }

     double calculatePerimeter(){
        double perimeter = (2*width) + (2*height);
                return perimeter;
    }
}
