package asiignment5Day2;

    public class FigureMain {
        public static void main(String[] args) {
            Figure[] f = new Figure[5];
            UpwardHat uH = new UpwardHat("UpwardHat");
            uH.getFigure();
            DownwardHat dH= new DownwardHat("DownwardHat");
            dH.getFigure();
            FaceMaker fM = new FaceMaker("FaceMaker");
            fM.getFigure();
            Vertical v = new Vertical("Vertical");
            v.getFigure();
            System.out.println("");
            f[0]=uH;
            f[1]=uH;
            f[2]=dH;
            f[3]=fM;
            f[4]=v;
            for(Figure x: f) {
                //System.out.print(x);
                System.out.print(x.getClass().getSimpleName() + ": ");
                x.getFigure();
                System.out.println("");
            }
        }
    }

