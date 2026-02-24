public class main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "John Doe");
        account.deposit(1000);
        System.out.println(account.getBalance());  // Should print 1000.0

        boolean success = account.withdraw(500);
        System.out.println(success);               // Should print true
        System.out.println(account.getBalance());  // Should print 500.0

        success = account.withdraw(1000);
        System.out.println(success);               // Should print false
    }
}