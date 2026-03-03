package tripillar_coding_assesment.Module_3;
import java.util.Scanner;
public class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();
        System.out.println("Enter Initial Balance:");double bal = sc.nextDouble();
        BankAccount b1 = new BankAccount(accNo, bal);
        b1.deposit(1000);
        b1.withdraw(500);
        b1.display();
    }
}
