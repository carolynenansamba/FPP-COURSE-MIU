package asiignment5Day2;



public class Vertical implements Figure{
    public static String name;
    public Vertical(String name){
        this.name = name;
    }

    @Override
    public void getFigure() {
        System.out.print("||");
    }

    /*public String toString(){
        return Vertical.name + ": ";
    }*/
}
