//Write a program to print the week day for the given day no. of the current month using switch case statement .

public class Prog1_3 {
    public static void main(String[]args){
        int date = 4; //current month Febuary 2025
        int day = (date)% 7;
        switch(day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid Input!!");
                
        }
    }
}
