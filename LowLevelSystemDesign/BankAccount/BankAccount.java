class BankAccount {
    // Add private fields: accountNumber (String), ownerName (String), balance (double)
    private String accountNumber;
    private String ownerName;
    private double balance;
    public BankAccount(String accountNumber, String ownerName) {
        // Initialize fields. Balance should start at 0.
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        // Add amount to balance (only if amount is positive)
        if(amount <= 0) return;
        balance += amount;
    }

    public boolean withdraw(double amount) {
        // Remove amount from balance if sufficient funds exist
        // Return true if successful, false otherwise
        if(balance - amount < 0) return false;
        balance -= amount;  
        return true;
    }

    public double getBalance() {
        // Return the current balance

        if(balance > 0) return balance;
        return 0;
    }
}