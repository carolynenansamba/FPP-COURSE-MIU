package abstractClasses;

public class Circle extends ClosedCurve {
    double radius;

    Circle (double radius){
        this.radius = radius;

    }

    @Override
    double computeArea(){
        return Math.PI * radius *radius;

    }
}