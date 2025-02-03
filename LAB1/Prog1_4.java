//Program to check a user entered number is palindrome or not

public class Prog1_4 {
    public static void main(String[]args){
        int number = 1244321;
        int test = number;
        int rev = 0;

        while(number !=0){
            int digit = number %10;
            rev = rev*10 + digit;
            number /= 10;

        }

        if(test == rev){
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Isn't palindrome");

        }

    }
}
