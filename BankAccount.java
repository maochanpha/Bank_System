import java.time.LocalDate;
import java.util.Vector;

public class BankAccount {
    private String accountNum;
    private double basicBalance;
    private double balance;

    private Customer cus;
    private Vector<History> accHistory;

    // Constructor 1
    public BankAccount() {
        accHistory = new Vector<>();
    }

    // Constructor 2
    public BankAccount(String accountNum, double basicBalance) {
        this.accountNum = accountNum;
        this.basicBalance = basicBalance;
        this.balance = basicBalance;
        accHistory = new Vector<>();
    }

    public void setCustomer(Customer cus) {
        this.cus = cus;
    }

    public void deposit(double amount) {
        balance += amount;
        accHistory.add(new History(LocalDate.now(), "Deposit", amount));
    }

    public void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;
            accHistory.add(new History(LocalDate.now(), "Withdraw", amount));
        } else {
            System.out.println("❌ Not enough balance!");
        }
    }

    public void interest(double amount) {
        balance += amount;
        accHistory.add(new History(LocalDate.now(), "Interest", amount));
    }

    public String getAccountNumber() {
        return accountNum;
    }

    public double getBasicBalance() {
        return basicBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void showHistory() {
        System.out.println("\n=== Transaction History ===");
        for (History h : accHistory) {
            System.out.println(h.getInfo());
        }
    }

    public void showAccountInfo() {
        System.out.println("\n=== Account Info ===");
        System.out.println("Account: " + accountNum);
        System.out.println("Customer: " + cus.getInfo());
        System.out.println("Balance: $" + balance);
    }
}