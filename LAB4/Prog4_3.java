import java.util.*;
class Student{
    public int rollno;
    public String name;
    // float cgpa;
    float Lowestgpa;
    
    // public Student(int r, String n, float c) {
    //     rollno = r;
    //     name = n;
    //     // cgpa = c;
    // }
    
    void display(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] cgpa = new float[n];
        // rollno = sc.nextInt();
        // name = sc.next();
        // cgpa[i] = sc.nextFloat();
        
        for(int i = 0; i<n; i++){
            System.out.println("ENter Rollnumber");
            rollno = sc.nextInt();
            System.out.println("Enter Name ");
            name = sc.next();
            System.out.println("Enter gpa");
            cgpa[i] = sc.nextFloat();
           
        }
        Lowestgpa = cgpa[0];
        for (int i = 1; i < n; i++) {
            if (cgpa[i] < Lowestgpa) {
                Lowestgpa = cgpa[i];
            }

        }
        System.out.println("The lowest CGPA is: " + Lowestgpa);

    }
}

public class Prog4_3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
