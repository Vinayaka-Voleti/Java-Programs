import java.util.*;

public class Prog6_5 {

    public static void main(String[] args) {
        int[][] seats = new int[5][10];
        try(Scanner sc = new Scanner(System.in)){
        
        while(true) {
            displaySeating(seats);
            
            System.out.print("Entr row (1-5) and seat(1-10): ");
            int row = sc.nextInt();
            int seat = sc.nextInt();

            if(row == 0 && seat == 0) {
                System.out.println("Exit");
                break;
            }
            
            if(row < 1 || row > 5 || seat < 1 || seat > 10) {
                System.out.println("Invalid input!\n");
                continue;
            }
            
            int actualRow = row - 1;
            int actualSeat = seat - 1;
            
            if(seats[actualRow][actualSeat] == 1) {
                System.out.println("Already taken\n");
            } else {
                seats[actualRow][actualSeat] = 1;
                System.out.println("Already takrn!\n");
            }
        }
        
    }
    }
    private static void displaySeating(int[][] seats) {
        System.out.println("\nCurrent Seating Arrangement:");
        for(int i = 0; i < seats.length; i++) {
            System.out.print("R" + (i + 1) + ": ");
            for(int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}