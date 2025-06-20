package Task2;
public class Task2 {

    public static void main(String[] args) {

        //Encapsulation
        class BankAccount {
            private String accountNumber;
            private String accountHolder;
            private double balance;

            public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
                this.accountNumber = accountNumber;
                this.accountHolder = accountHolder;
                this.balance = initialBalance;
            }

            public void deposit(double amount) {
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposited: " + amount);
                } else {
                    System.out.println("Deposit amount must be positive.");
                }
            }

            public void withdraw(double amount) {
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawn: " + amount);
                } else if (amount > balance) {
                    System.out.println("Insufficient funds for withdrawal.");
                } else {
                    System.out.println("Withdrawal amount must be positive.");
                }
            }

            public void displayAccountInfo() {
                System.out.println("Account Holder: " + accountHolder);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Balance: " + balance);
            }
        }


        // Create a BankAccount object
        BankAccount account = new BankAccount("123456789", "Mark Bunyi", 3500.00);

        // Display the initial account information
        System.out.println("Initial account information:");
        account.displayAccountInfo();
        System.out.println();

        // Deposit some money
        account.deposit(500.00);
        System.out.println();

        // Withdraw some money
        account.withdraw(200.00);
        System.out.println();
        
        // Display updated account information
        System.out.println("Updated account information:");
        account.displayAccountInfo();
        System.out.println();
        
        // Try to withdraw more money than the balance
        // account.withdraw(2000.00);
        // System.out.println();

        // Display final account information
        System.out.println("Final account information:");
        account.displayAccountInfo();
    }
    
}
