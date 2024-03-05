package asiignment5Day2;

public class UpwardHat implements Figure {

    public static String name;
    public UpwardHat(String name){
        this.name = name;
    }

    @Override
    public void getFigure(){
        System.out.print("/\\");
    }

    /*public String toString(){
        return UpwardHat.name + ": ";
    }*/

}