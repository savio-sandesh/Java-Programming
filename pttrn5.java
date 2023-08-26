public class pttrn5 {
    public static void main(String[] args) {
    //     int n=5;
    //     int i=0;
    //     while (i<=n) {
    //         int space = 0;
    //         while(space<i)
    //         {
    //             System.out.print("  ");
    //             space++;
    //         }
    //         int j=0;
    //         while (j<n-i) {
    //             System.out.print("* ");
    //             j++;
    //         }
    //         System.out.println();
    //         i++;
    //     }

    int rows = 5;
    int space;
    int i,j;

    for(i=1;i<=rows;i++){
        for(space=0;space<=2*i;space++)
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
