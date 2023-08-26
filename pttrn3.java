public class pttrn3 {
    public static void main(String[] args) {
        // int i=5;
        // while (i>=1) {
        //     int j=1;
        //     while (j<=i) {
        //         System.out.print("* ");
        //         j++;
        //     }
        // System.out.println();
        // i--;
        // }

        int rows=5;
        int i,j;
        for(i=rows-1;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
