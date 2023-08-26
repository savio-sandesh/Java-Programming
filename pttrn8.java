public class pttrn8 {
    public static void main(String[] args) {
        int row=5,i,j,column=5;
        for(i=1;i<=row;i++){
            for(j=1;j<=column;j++){
                if(i==j || j==row-i+1){
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
