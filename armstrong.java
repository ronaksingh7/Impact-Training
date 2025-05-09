import java.math.*;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int digits = String.valueOf(num).length();
        int digit = 0, sum = 0, ogNum = num;

        while(num != 0){
            digit = num % 10;
            sum += Math.pow(digit,digits);
            num = num / 10;
        }

        if(sum == ogNum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an ARmstrong number");
        }
    }
}
