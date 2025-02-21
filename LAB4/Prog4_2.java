//Accept 10 numbers from command line and check how many of them are even and how many are odd.
public class Prog4_2 {
    public static void main(String[] args) {
        int counteven = 0;
        int countodd = 0;
        int[] check = {12,13,14,15,16,17,18,19,20,21};
        for(int i = 0; i<10;i++){
            if (check[i] % 2 == 0) {
                counteven++;
            }
            else{
                countodd++;
            }
        }
        System.out.println("No. of Even numbers ="+counteven+"\nNo. of odd numbers ="+countodd);
    }
}
