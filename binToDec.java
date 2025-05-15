import java.util.*;
public class binToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Binary Number: ");
        int bin = sc.nextInt();
        
        int rev=0, temp=0, pow=0, sum=0;

        while(bin != 0){
            temp = bin % 10;
            rev =temp * (int)(Math.pow(2,pow));
            sum = sum + rev;
            bin = bin / 10;
            pow++;
        }

        System.out.println("Decimal = " + sum);
    }
}
