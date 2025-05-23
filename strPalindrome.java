import java.util.*;
public class strPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        s = s.toLowerCase();

        String temp = "";

        for(int i = s.length() - 1; i >= 0; i--){
            temp = temp + s.charAt(i);
        }

        if(s.equals(temp))
            System.out.println("Palindrome");
        else{
            System.out.println("Not Palindrome");
        }
    }
}
