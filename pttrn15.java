// public class pttrn15 {
//     public static void main(String[] args) {
//         int row =5;
//         int i,j;
//         for(i=0;i<row;i++)
//         {
//             for(j=0;j<2*i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(j=0;j<=2*(row-i)-1;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(i=row-2;i>=0;i--)
//         {
//             for(j=0;j<=2*i;j++)
//             {
//                 System.out.print("  ");
//             }
//             for(j=0;j<=2*(row-i)-1;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         } 
//     }
// }
public class pttrn15 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("    ");
            }
            for (int j = i; j <= rows; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i <= rows - 1; i++) {
            for (int j = rows - 1; j > i; j--) {
                System.out.print("    ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
