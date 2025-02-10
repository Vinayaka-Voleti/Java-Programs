//Accept 10 numbers from command line and check how many of them are even and how many are odd.

import java.util.Scanner;

public class Prog2_2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int i ;
        int num_of_e = 0;
        int num_of_o = 0;
        int[] arr = new int[10];
        for(i = 0; i<10;i++){
            System.out.println("Enter Number"+i);
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                num_of_e++;
            }
            else{
                num_of_o++;
            }
            
        }
        System.out.println(num_of_e);
        System.out.println(num_of_o);
    }
    }
}
