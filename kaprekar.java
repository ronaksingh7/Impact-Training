import java.util.*;
public class kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int temp = num, divisor = 1, sq = (num * num);

        while(temp != 0){
            divisor = divisor * 10;
            temp = temp / 10;
        }

        int right = sq % divisor;
        int left = sq / divisor;
        int sum = left + right;

        if(sum == num){
            System.out.println("Kaprekar number");
        }
        else{
            System.out.println("Not Kaprekar NUmber");
        }
        sc.close();
    }
}