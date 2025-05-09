import java.util.*;
public class adam_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sqNum=0, revNum=0, sqRev=0, rev2=0, d=0, t=0;

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        sqNum = (num * num);

        while(num != 0){
            d = num % 10;
            revNum = (revNum*10) + d;
            num = num/10;
        }

        sqRev = (revNum * revNum);

        while(sqRev != 0){
            t = sqRev % 10;
            rev2 = (rev2*10) + t;
            sqRev = sqRev/10;
        }

        if(sqNum == rev2){
            System.out.println("Adam Number");
        }
        else{
            System.out.println("Not an Adam Number");
        }
    }
}
