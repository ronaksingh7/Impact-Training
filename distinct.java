import java.util.*;
public class distinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 1;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                count++;
            }
        }
        System.out.println("There are " + count + " distinct element in the array.");
    }
}
