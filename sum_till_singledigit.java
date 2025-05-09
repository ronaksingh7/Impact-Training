import java.util.*;
public class sum_till_singledigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rev=0, sum=0;

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        while(num > 10){
            sum = 0;
            while(num != 0){
                rev = num % 10;
                sum += rev;
                num = num/10;
            }
            num = sum;
        }
        System.out.println(sum);
    }
}
