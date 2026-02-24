public class Car {
    // Attributes
    private String brand;
    private String model;
    private int speed;

    // Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    // method to accelerate
    public void accelerate(int increment) {
        speed += increment;
    } 

    // method to display
    public void displayStatus() {
        System.out.println(model + " is running at " + speed + " km/h");
    }
}