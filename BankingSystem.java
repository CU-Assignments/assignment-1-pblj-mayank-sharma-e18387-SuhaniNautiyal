// src/BankingSystem.java
import java.util.Scanner;

class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        }
    }

    public String getName() { return name; }
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Account Number: ");
        String accNo = sc.nextLine();
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accNo, balance);

        System.out.print("Deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
    }
}
