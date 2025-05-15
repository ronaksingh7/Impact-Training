import java.util.Scanner;
import java.math.*;

public class GoodInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int cbrt = (int) Math.cbrt(arr[i]); 
            int lb = 1, ub = cbrt;  

            while (lb <= ub) {  
                int x = lb * lb * lb;
                int y = ub * ub * ub;
                int sum = x + y;

                if (sum == arr[i]) {
                    count++;
                    break; 
                } else if (sum < arr[i]) {
                    lb++; 
                } else {
                    ub--; 
                }
            }
        }

        System.out.println("count = " + count);
    }
}