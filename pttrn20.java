public class pttrn20 {
    public static void main(String[] args) {
        int n = 3; // Number of rows in the upper half
        
        // Upper part of the pattern
        for (int i = 0; i <= n; i++) {
            // Print spaces before stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("    ");
            }
            
            // Print star on the left side
            System.out.print("*");
            
            // Print spaces in the middle
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("    ");
            }
            
            // Print star on the right side
            if (i != 0) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // Lower part of the pattern
        for (int i = n - 1; i >= 0; i--) {
            // Print spaces before stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("    ");
            }
            
            // Print star on the left side
            System.out.print("*");
            
            // Print spaces in the middle
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("    ");
            }
            
            // Print star on the right side
            if (i != 0) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
