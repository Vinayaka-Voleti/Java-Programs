import java.util.Scanner;
class  plastic{
    int length;
    int width;

    public plastic(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int area1(){
        return length * width;
    }
    void calculatecost(){
        double cost = 40 * area1();
        System.out.println("Cost to fill the plastic box: " + cost);
    }
}

class area2 extends plastic{
    int height ;
    public area2(int length, int width, int height){
        super(length,width);
        this.height = height;
    }
    public int volume(){
        return length * width * height;
    }
    @Override
    void calculatecost(){
        double cost = 60 * volume();
        System.out.println("Cost to fill the plastic box: " + cost);
    }

}

public class Prog5_1 {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter length of plastic box: ");
        int length = sc.nextInt();
        System.out.print("Enter width of plastic box: ");
        int width = sc.nextInt();
        plastic box = new plastic(length, width);
        System.out.println("area of 2D sheet is :"+box.area1());
        box.calculatecost();
        
        System.out.print("Enter length of plastic box: ");
        length = sc.nextInt();
        System.out.print("Enter width of plastic box: ");
        width = sc.nextInt();
        System.out.print("Enter height of plastic box: ");
        int height = sc.nextInt();
        area2 box2 = new area2(length, width, height);
        System.out.println("Volume of 3D box is :"+box2.volume());
        box2.calculatecost();
        
        
    }
}
    
}