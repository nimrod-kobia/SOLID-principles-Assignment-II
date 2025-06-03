// Superclass
abstract class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

// Interface for flying capability
interface Flyable {
    void fly();
}

// Plane can fly
class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}

// Car can't fly
class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving on the road");
    }
}

public class Liskov {
    // Accept only flying machines
    public static void makeItFly(Flyable flyableVehicle) {
        flyableVehicle.fly();
    }

    // Accept only drivable machines (in this case, just cars)
    public static void makeItDrive(Car car) {
        car.drive();
    }

    public static void main(String[] args) {
        Plane myPlane = new Plane();
        Car myCar = new Car();

        makeItFly(myPlane);
        makeItDrive(myCar); 
     // makeItFly(Car); will not work as a car is not capable of flying
    }
}

