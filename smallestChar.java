import java.util.*;
public class smallestChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        
        int arr[] = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            arr[i] = (int) s.charAt(i);
        }
        
        Arrays.sort(arr);

       // System.out.println(Arrays.toString(arr));

        int x = arr[0] + 1;

        System.out.println((char)x);
    }
}
