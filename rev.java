import java.util.*;
public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=0, fd=0, ld=0, rev=0, sd=0;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        fd = num/100;
        ld = num%10;
        sd = (num/10) % 10;
        
        rev = (ld*100) + (sd*10) + fd;

        System.out.println("Reversed NUmber: " + rev);
    }
}
