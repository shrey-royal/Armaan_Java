class Vehicle {
    Vehicle startEngine() {
        System.out.println("Starting the engine of a generic vechicle.");
        return this;
    }
}

class Car extends Vehicle {
    @Override
    Car startEngine() {
        System.out.println("Starting the engine of a car.");
        return this;
    }

    void stopEngine() {
        System.out.println("Car engine is off");
    }
}

public class CVRT {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();
        
        Car car = new Car();
        car.startEngine();
        // car.stopEngine();

        Vehicle vehicle2 = new Car();
        vehicle2.startEngine();
        // vehicle2.stopEngine();
    }
}
