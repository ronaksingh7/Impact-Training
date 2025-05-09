import java.util.*;
public class collatz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int count = 0;

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(n);

        while(n > 1){
            if(n%2==0){
                n = n / 2;
            }
            else{
                n = (3*n) + 1;
            }
            System.out.println(n);
            count += 1;
        }

        System.out.println(count);
        sc.close();
    }
}
