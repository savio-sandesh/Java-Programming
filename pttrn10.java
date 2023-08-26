public class pttrn10 {
 public static void main(String[] args) {
    int rows,space=0,nxtstar=11,tspace;
    for (rows=0;rows<7;rows++) {
        for(tspace=0;tspace<space;tspace++){
            System.out.print("  ");
        }
        for(int star=0;star<nxtstar;star++){
            System.out.print("* ");
        }
        space++;
        nxtstar-=2;
        System.out.println();
    }
 }   
}
