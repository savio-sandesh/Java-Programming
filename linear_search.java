import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int n;
        int[] num = new int [10];
        int target; 

    //input section
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the Numbers of element:");
        n=inp.nextInt();
        System.out.println("Enter the element of an array:");
            for (int i = 0; i < n; i++) 
            {
            num[i]=inp.nextInt();
            }
        System.out.print("Enter the target number:");
        target = inp.nextInt();

        int ans = linearSearch(num, target);
        System.out.println(ans);
        inp.close();
    }
    // linear search method
    static int linearSearch(int[] num, int target) {
        for (int index = 0; index < num.length; index++) {
            int element = num[index];
            if (element == target) {
                return index;
            }
        }
        return -1; 
    }
}