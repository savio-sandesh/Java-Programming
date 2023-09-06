public class find_min {
    public static void main(String[] args) {
        int[]arr={34,23,89,34,54};
        int ans = minvalue(arr);
        System.out.println(ans);
    }

    static int minvalue(int[]arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
