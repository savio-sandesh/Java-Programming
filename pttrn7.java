public class pttrn7 {
    public static void main(String[] args) {
        int row=5;
        int column=5;

        for(int i=1;i<=row;i++){
            for(int star=1;star<=column;star++){
                if ((i==1 || i==row) || (star==1 || star==column)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
