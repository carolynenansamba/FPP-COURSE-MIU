package asiignment5Day2;
 class DownwardHat implements Figure {
    public static String name;
    public DownwardHat(String name){
        this.name = name;
    }

    @Override
    public void getFigure(){
        System.out.print("\\/");
    }

}

