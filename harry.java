import java.util.*;
public class harry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0, result = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        result = (num / 1000) + (num % 10);
        System.out.println("Sum of first and last digit = " + result);
    }
}
