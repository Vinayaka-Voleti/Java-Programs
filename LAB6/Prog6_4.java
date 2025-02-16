class Employee {
    final String companyName = "TechCorp";

    void displayCompanyName() { // add final keyword it gives error in compile time 
        System.out.println("Company Name: " + companyName);
    }
}


class Developer extends Employee {
    
    
    @Override
    void displayCompanyName() {
        System.out.println("Trying to override the final method!");
    }

}

public class Prog6_4 {
    public static void main(String[] args) {
        Employee emp = new Developer();
        emp.displayCompanyName(); 
    }
}
