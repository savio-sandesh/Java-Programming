public class pttrn6 {
    public static void main(String[] args) {
        // int n=5;
        // int i=0;
        // while (i<=n) {
        //     int space = 0;
        //     while(space<i)
        //     {
        //         System.out.print("    ");
        //         space++;
        //     }
        //     int j=0;
        //     while (j<n-i) {
        //         System.out.print("* ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }
        int row=5;
        int i,j,k;
        for (i=1; i<=row; i++) {
            for(j=0;j<=4*i;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<=row-i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
            }
     }
}
