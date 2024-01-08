package __pycache__.nqt_and_digital.codesoft;
/**
 * InnerTASK3
 */
/**
 * InnerTASK3
 */
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            System.out.println("Deposit amount should be greater than 0.");
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
            return false;
        }
    }

    public double checkBalance() {
        return this.balance;
    }
}

class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. Your balance is: " + account.checkBalance());
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    public void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (account.deposit(amount)) {
            System.out.println("Deposit successful. Your balance is: " + account.checkBalance());
        } else {
            System.out.println("Deposit failed.");
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + account.checkBalance());
    }
}

public class TASK3{
    public static void main(String[] args) {
        // Creating a bank account
        BankAccount userAccount = new BankAccount(1000);

        // Initializing ATM with the bank account
        ATM atm = new ATM(userAccount);

        // ATM User Interface
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to the ATM!");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please select an option (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.withdraw();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        }
    }
}
