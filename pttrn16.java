public class pttrn16 {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the size of the pattern
        
        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= (n - i) * 4; j++) {
                System.out.print(" ");
            }
            
            // Print stars for the upper half
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces before the stars
            for (int j = 1; j <= (n - i) * 4; j++) {
                System.out.print(" ");
            }
            
            // Print stars for the lower half
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
