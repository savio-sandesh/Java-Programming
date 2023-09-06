public class search_in_range{
    public static void main(String[] args) {
        int[] arr= {12,34,54,58,90,23};
        int target=12;
        int ans = searchInRange(arr,target,1,4);
        System.out.println(ans);
        }
        static int searchInRange(int[] arr,int target,int start,int end)
        {
            if(arr.length==0){
                return -1;
            }
            for (int i = start; i < end; i++) {
                int element=arr[i];
                if(element==target){
                    return i;
                }
            }
            return -1;
        }
    }
