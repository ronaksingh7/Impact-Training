import java.util.*;
public class trendy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num<100 || num>999){
            System.out.println("The number is not Trendy");
            System.exit(0);
        }

        int mid = (num/10) % 10;
        if(mid%3 == 0){
            System.out.println("The number is Trendy");
        }
        else{
            System.out.println("The number is not Trendy");
        }
    }
}
