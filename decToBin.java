import java.util.*;
public class decToBin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Decimal Number: ");
        int num = sc.nextInt();
        int rev = 0;
        int temp = 0;

        while(num != 0){
            temp = (temp * 10) + (num % 2);
            num = (int)Math.floor(num/2);
        }

        while(temp != 0){
            rev = (rev*10) + (temp%10);
            temp = temp / 10;
        }
        System.out.println(rev);
    }
}
