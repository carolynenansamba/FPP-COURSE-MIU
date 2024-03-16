package abstractClasses;

public class Rectangle extends ClosedCurve{
    double width;
    double length;
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;

    }
    @Override
    double computeArea(){
        return width * length;
    }
}
