public class pttrn14 {
    public static void main(String[] args) {
    int rows = 5;
    int space;
    int i,j;
    for(i=1;i<rows;i++)
    {
            for(space=2*(rows-i);space>=0;space--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
    }
    for(i=1;i<=rows;i++){
        for(space=2;space<=2*i;space++)
        {
            System.out.print(" ");
        }
        for(j=0;j<=rows-i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
  }
}