import java.util.Scanner;
public class search_in_str{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String Str = sc.next();
        System.out.print("Enter the Character U want to search:");
        char c = sc.next().charAt(0);

        System.out.println(search(Str,c));
        sc.close();
    }
    static boolean search(String Str ,char c){
        if(Str.length()==0){
            return false;
        }
        for(int i=0;i<Str.length();i++){
            if(c == Str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}