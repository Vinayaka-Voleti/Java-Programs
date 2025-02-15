class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }
}

public class Prog6_3 {
    public static void main(String[] args) {
        Vehicle vehicle;
        
        vehicle = new Car();
        vehicle.start();  // Output: Car is starting.
        
        vehicle = new Bike();
        vehicle.start();  // Output: Bike is starting.
    }
}
