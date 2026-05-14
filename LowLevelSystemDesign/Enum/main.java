public class main {
    public static void main(String[] args) {
        Order order = new Order("ORD-001", PaymentMethod.CREDIT_CARD, 99.99);
        order.displayInfo();

        order.advanceStatus(); //Placed -> CONFIRMED
        order.advanceStatus(); //CONFIRMED -> SHIPPED
        
        order.displayInfo();
        System.out.println("cancel after shipping: " + order.cancel()); // false
    }
}