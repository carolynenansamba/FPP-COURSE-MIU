package Asignment5Qtn1;

public class Circle extends Shape{
    int radius;

    public Circle(String color,int radius) {
        super(color);
        this.radius = radius;

    }
    @Override
     double calculateArea(){
        double area = Math.PI * radius *radius ;
        return area;

}
@Override
 double calculatePerimeter(){
        double perimeter = 2* Math.PI *radius;
        return perimeter;
}



}
