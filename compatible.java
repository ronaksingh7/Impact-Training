import java.util.*;
public class compatible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr1[] = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int arr2[] = new int[m];

        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(n == m){
                if(arr1[i] <= arr2[i]){
                    count++;
                }
            }
            else{
                System.out.println("Not Compatible");
            }
        }

        if(count == 0){
            
        }
    }
}
