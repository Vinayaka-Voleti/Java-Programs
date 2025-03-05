class Box {
    double length;
    double width;
    double height;

    double volume() {
        return length * width * height;
    }
    public double  peri (){
     
        return length + width + height;
    }
}
public class box0 {
    public static void main(String[] args) {
        Box myBox = new Box();

        myBox.length = 5.0;
        myBox.width = 4.0;
        myBox.height = 3.0;

        System.out.println("Volume of the box: " + myBox.volume());
        System.out.println("Dimensions of the box " + myBox.peri());
    }
}

