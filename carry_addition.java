import java.util.*;
public class carry_addition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr1[] = new int[m];
        int arr2[] = new int[n];

        int rev1=0, rev2=0;

        for(int i = 0; i < m; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i = m-1; i >= 0; i--){
            rev1 = (rev1*10) + arr1[i];
        }

        for(int i = n-1; i >= 0; i--){
            rev2 = (rev2*10) + arr2[i];
        }

        int sum = rev1 + rev2;
        System.out.println(sum);

    }
}