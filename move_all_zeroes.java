import java.util.*;

public class move_all_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder(); // Store results temporarily

        for(int i = 0; i < n; i++){
            int rev = 0, count = 0;
            int m = sc.nextInt();
            while(m > 0){
                int temp = m % 10;
                if(temp == 1)
                    rev = (rev*10) + temp;
                else{
                    count++;
                }
                m = m / 10;
            }
            int pow = (int)Math.pow(10, count);
            int ans = rev * pow;

            output.append(ans).append("\n"); 
        }

        System.out.print(output.toString());
    }
}