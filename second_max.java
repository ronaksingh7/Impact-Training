import java.util.*;
public class second_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secMax = arr[0];

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }
            else if(arr[i] > secMax && arr[i] != max)
                secMax = arr[i];
        }

        System.out.println(secMax);
    }
}
