import java.util.Scanner;

class Grandparent{
    protected int age;
    protected String name;
    
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Parent extends Grandparent{
    protected String occupation;
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Occupation: " + occupation);
    }
}
class Child extends Parent{
    String school;
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("School: " + school);

        
    }
}
public class Prog6_1{
    public static void main(String[] args) {
        Child c1 = new Child();
        try(Scanner sc = new Scanner(System.in)){
        
        System.out.println("Enter Name, Age: ");
        c1.name = sc.next();                              // attributes from Grandparent
        c1.age = sc.nextInt();                            
        
        System.out.println("Enter Occupation:");
        c1.occupation = sc.next();                        // attributes from Parent class
        
        
        System.out.println("Enter School name :");
        c1.school = sc.next();                            // attributes from Child class
        
        c1.displayDetails();
        
        sc.close();
    }
}
}