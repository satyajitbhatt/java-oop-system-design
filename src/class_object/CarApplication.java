package class_object;

public class CarApplication {

    public static void main(String[] args) {
        Car rangeRover = new Car("Range Rover", "Land Rover");
        rangeRover.startEngine();
        rangeRover.accelerate(60);
        rangeRover.brake(20);
        rangeRover.stopEngine();

        System.out.println("----------------------------------------------");

        Car bmw = new Car("BMW", "BMW X7");
        bmw.startEngine();
        bmw.accelerate(70);
        bmw.accelerate(30);
        bmw.brake(30);
        bmw.stopEngine();
    }
}
