// Lab2 {arrays, Scanner}
//Find the largest among 3 user entered nos. at the command prompt using Java
import java.util.*;
public class Prog2_1 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1 :");
        num1 = sc.nextInt();
        System.out.println("Enter Number2 :");
        num2 = sc.nextInt();
        System.out.println("Enter Number3 :");
        num3 = sc.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.println(num1+" is Greater");
        }
        else if(num1<num2 && num2>num3){
            System.out.println(num2 + " is Greater");
        }
        else if (num1<num3 && num2<num3){
            System.out.println(num3+" is Greater");
        }
        // sc.close();
    }
}
