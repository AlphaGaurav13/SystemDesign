enum TrafficLight {
    // Define enum constants with duration: RED(30), YELLOW(5), GREEN(25)
    RED(30),
    YELLOW(5),
    GREEN(25);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public TrafficLight next() {
        // Return next light: RED->GREEN, GREEN->YELLOW, YELLOW->RED
        switch(this) {
            case RED: return GREEN;
            case GREEN: return YELLOW;
            case YELLOW: return RED;
            default: return this;
        }
    }

    public void display() {
        // Print: "COLOR (Xs)" e.g. "RED (30s)"
        System.out.println(this.name() + " (" + duration + "s)");
    }
}

// Test your implementation
public class main {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;
        for (int i = 0; i < 6; i++) {
            light.display();  // Should show color and duration
            light = light.next();
        }
    }
}