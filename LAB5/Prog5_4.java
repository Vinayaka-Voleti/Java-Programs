import java.util.*;

class acco{
    int balance;
    int acc_no;

    
    public void details(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the account number:");
        acc_no = sc.nextInt();
        System.out.println("Enter the initial balance:");
        balance = sc.nextInt();
    }
    void display(){
        System.out.println("Account Number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}
class person extends acco{
    String name;
    int aadhar_no;

    @Override
    public void details(){
        Scanner sc = new Scanner(System.in);
        super.details();  // calling the parent's method
        System.out.println("Enter the name:");
        name = sc.next();
        System.out.println("Enter the Aadhar Number:");
        aadhar_no = sc.nextInt();

    }
    @Override
    void display(){
        
        
        System.out.println("Name: "+name);
        System.out.println("Aadhar Number: "+aadhar_no);
        super.display();  // calling the parent's method
    }

    
}


public class Prog5_4{
    public static void main(String[] args) {
        person[] p = new person[3];
        for(int i=0; i<3; i++){
            System.out.println("Enter the details for person" +(i+1)+":");
            p[i] = new person();
            p[i].details();
        }
        
    
        System.out.println("Details of person:");
        for(int i=0; i<3; i++){
            System.out.println("\nPerson "+(i+1)+":");
            p[i].display();
        } 
    }
}