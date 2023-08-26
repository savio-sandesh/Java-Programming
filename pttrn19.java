public class pttrn19 {
    public static void main(String[] args) {
        int n = 3; // Number of rows in the upper half

       

        // Lower part of the pattern
        for (int i = n; i >= 1; i--) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Print stars on the right side
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
         // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Print stars on the right side
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
