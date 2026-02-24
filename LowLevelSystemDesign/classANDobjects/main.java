public class main {
    public static void main(String[] args) {
        Car xuv = new Car("Mahindra", "xuv");
        Car d30 = new Car("BMW", "d30");
        
        xuv.displayStatus();
        System.out.println("----------------------------");
        d30.displayStatus();

        xuv.accelerate(30);
        xuv.displayStatus();
    }
}