public class pttrn4 {
    public static void main(String[] args) {
        // int n=5;
        // int i=1;
        // while (i<=n) {
        //     int space = 1;
        //     int j=1;
        //     while (space<=n-i) {
        //         System.out.print("  ");
        //         space++;
        //     }
        //     while(j<=i){
        //         System.out.print("* ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        int rows = 5;
        int space;
        int i,j;

        for(i=1;i<=rows;i++){
            for(space=2*(rows-i);space>=0;space--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
