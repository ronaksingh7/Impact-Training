import java.util.*;
public class stringFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.print("Enter the character to find frequency: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ch)
                count++;
        }

        System.out.println("Frequency = " + count);
    }
}
