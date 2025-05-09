import java.util.*;
public class weird {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 != 0){
            System.out.println("Weird");
        }

        if(num % 2 == 0){
            if(num >= 2 && num <=5){
                System.out.println("Not Weird");
            }
            else if(num >= 6 && num <= 20){
                System.out.println("Wierd");
            }
            else{
                System.out.println("Not Weird");
            }
        }
    }
}
