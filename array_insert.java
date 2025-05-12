import java.util.*;
public class array_insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr1[] = new int[size];

        for(int i = 0; i < size; i++){
            arr1[i] = sc.nextInt();
        }

        int pos = sc.nextInt();
        if(pos > size){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        
        int ele = sc.nextInt();

        System.out.println("Array after insertion is");
        for(int i = 0; i < size; i++){
            if(arr1[i] == arr1[pos-1]){
                System.out.println(ele);
            }
            System.out.println(arr1[i]);
        }
    }
}
