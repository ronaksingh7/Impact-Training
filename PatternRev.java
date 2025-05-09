import java.util.*;

public class PatternRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = -n; i <= n; i++) {  
            int absI = Math.abs(i);  

            for (int j = 0; j < absI; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (n - absI) * 2 + 1; k++) {
                System.out.print("*");
            }

            System.out.println();  
        }
        sc.close();
    }
}