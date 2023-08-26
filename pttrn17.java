public class pttrn17{
    public static void main(String[] args) {
        int rows = 6; // Total number of rows in the pattern
        
        // Loop to iterate through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print spaces before the stars
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            
            // Loop to print the left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Move to the next line
            System.out.println();
            
            // Add a space between line 3 and line 4
            if (i == 3) {
                System.out.println();
            }
        }
        
        // Loop to print the bottom half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            // Loop to print spaces before the stars
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            
            // Loop to print the left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
