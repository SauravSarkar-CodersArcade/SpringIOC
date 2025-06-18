package withoutSpring;

// Engine.java
public class Engine {
    public void start() {
        System.out.println("Engine started...");
    }
}

// Car.java
class Car {
    private Engine engine;

    public Car() {
        // Tightly coupled
        this.engine = new Engine();
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}

// Main.java
class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
