import java.util.*;
public class same_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum1=0, sum2=0;

        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            sum1 += arr1[i];
        }
        for(int i = 0; i < m; i++){
            sum2 += arr2[i];
        }

        if(n == m && sum1 == sum2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
}
