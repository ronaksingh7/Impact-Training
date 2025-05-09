import java.util.*;

public class blackbeard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total amount of treasure: ");
        int tres = sc.nextInt();

        System.out.println("Enter Long Ben's share (percentage): ");
        int lb = sc.nextInt();

        System.out.println("Enter Blackbeard's share (percentage): ");
        int bb = sc.nextInt();

        int lbt = (int)((lb / 100.0) * tres);
        tres -= lbt;

        int bbt = (int)((bb / 100.0) * tres);
        tres -= bbt;

        int rt = tres / 3;

        System.out.println("Long Ben's treasure = " + lbt);
        System.out.println("Blackbeard's treasure = " + bbt);
        System.out.println("Treasure divided among rest = " + rt);
    }
}