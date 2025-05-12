import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        int count = 0;
        int temp = 0;

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if(arr[i] == arr[j]) {
                    for(int k = j; k < size - 1; k++){
                        arr[k] = arr[k + 1];
                    }
                    size--; 
                    j--; 
                }
            }
        }

        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }
}