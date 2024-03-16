package interfaces;

public class Circle implements InterfaceClosedCurve{
    double radius;
    Circle(double radius){this.radius = radius;}

    @Override
    public double computeArea(){
        return Math.PI* radius *radius;

    }
}
