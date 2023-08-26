public class pttrn11{
    public static void main(String[] args) {
        int rows,stars,nxtstr=1,space=5,tspace;
        for(rows=0;rows<6;rows++){
            for(tspace=0;tspace<space;tspace++){
                System.out.print("  ");
            }
            for(stars=0;stars<nxtstr;stars++){
                System.out.print("* ");
                System.out.print("  ");

            }
            nxtstr=nxtstr+1;
            space=space-1;
            System.out.println();
        }
    }
}
