//Write a program to print the corresponding grade for the given mark using if..else statement in Java .

public class Prog1_2 {
    public static void main(String[]args){
        int marks = 90;
        if (marks>=90) {
            System.out.println("O grade");
        }
        else if (marks <90 && marks>=80) {
            System.out.println("E grade");
        }
        else if (marks <80 && marks>=70) {
            System.out.println("A grade");
        }
        else if(marks <70 && marks>=60) {
            System.out.println("B grade");
        }
        else if(marks <60 && marks>=50) {
            System.out.println("C grade");
        }
        else if(marks <50 && marks>=40) {
            System.out.println("D grade");
        }
        else if(marks <40 ) {
            System.out.println("Fail");
        }
        else{
            System.out.println("Invaild Input!!");
        }
    }
}
