package asiignment5Day2;


 public class FaceMaker implements Figure{
        public static String name;
        public FaceMaker(String name){
            this.name = name;
        }

        @Override
        public void getFigure(){
            System.out.print(":)");
        }

    /*public String toString(){
        return FaceMaker.name + ": ";
    }*/

    }

