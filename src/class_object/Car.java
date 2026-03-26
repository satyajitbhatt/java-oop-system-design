package class_object;

public class Car {

    private final String manufacturer;
    private final String model;
    private int speed;
    private boolean isEngineRunning;

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.speed = 0;
        this.isEngineRunning = false;
    }

    public void startEngine() {
        if(!isEngineRunning) {
            isEngineRunning = true;
            System.out.println(manufacturer + " - [" + model + "] engine started.");
        }
    }

    public void stopEngine() {
        if(isEngineRunning) {
            isEngineRunning = false;
            speed = 0;
            System.out.println(manufacturer + " - [" + model + "] engine stopped.");
        }
    }

    public void accelerate(int increment) {
        if (!isEngineRunning) {
            System.out.println("Start the engine first.");
            return;
        }

        speed += increment;
        System.out.println(manufacturer + " - [" + model + "] accelerating. Current speed: " + speed);
    }

    public void brake(int decrement) {
        speed -= decrement;

        if(speed < 0) {
            speed = 0;
        }

        System.out.println(manufacturer + " - [" + model + "] slowing down. Current speed : " + speed);
    }
}
