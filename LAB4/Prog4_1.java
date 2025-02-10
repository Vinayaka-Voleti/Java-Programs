// Aim of the program : Find the largest among 3 user entered nos. at the command prompt using Java

import java.util.*;

public class Prog4_1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter a number: ");
        int num1 =  sc.nextInt();
        System.out.println("Enter a number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter a number: ");
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3) {
            System.out.println(num1+" is greater");
        }
        else if (num2>num1 && num2>num3){
            System.out.println(num2+" is greater");
        }
        else if(num3>num1 && num3>num2){
            System.out.println(num3+" is greater");
        }
        else{
            System.out.println("Error !!!");
        }
    }
}
}
