package Asignment5Qtn1;

public class Circle extends Shape{
    int radius;

    public Circle(String color,int radius) {
        super(color);
        this.radius = radius;

    }
    @Override
     double calculateArea(){
       return Math.PI * radius *radius ;


}
@Override
 double calculatePerimeter(){
        return 2* Math.PI *radius;

}



}
