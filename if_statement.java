import java.util.*;
public class if_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a two digit number: ");
        int num = sc.nextInt();

        if(num<10 || num>99){
            System.out.println("The number is not two digit");
            System.exit(0);
        }

        if(num>20){
            System.out.println("The number is greater than 20");
        }
        else{
            System.out.println("The number is less than 20");
        }

        if(num%2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
