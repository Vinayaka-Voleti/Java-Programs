
import java.util.*;

//Program to sort the user entered list of numbers of any size

public class Prog2_3 {
    public static void main(String[] args) {
        
        try(Scanner sc= new Scanner(System.in)){
        int n =sc.nextInt();
        int[] arr = new int[n];
        for( int i = 0 ; i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<n ; i++) {
            int temp;
            if(arr[i]> arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }
        for(int i = 0; i <n; i++){
            System.out.println(arr[i]);
        }
    }
    }
}
