import java.time.LocalDate;
import java.util.Vector;

public class BankAccount {

    private String accountnum;

    private double basicbalance;
    private double balance;

    private Customer cus;

    private Vector<History> acchistory = new Vector<>();

    public BankAccount() {
    }

    public BankAccount(
            String accountnum,
            double basicbalance) {

        this.accountnum = accountnum;
        this.basicbalance = basicbalance;
        this.balance = basicbalance;
    }

    public void setCustomer(Customer cus) {
        this.cus = cus;
    }

    public void deposit(double amount) {

        balance += amount;

        acchistory.add(
                new History(
                        LocalDate.now(),
                        "Deposit",
                        amount));
    }

    public void withdrawal(double amount) {

        if (amount <= balance) {

            balance -= amount;

            acchistory.add(
                    new History(
                            LocalDate.now(),
                            "Withdraw",
                            amount));
        }
    }

    public void interest(double amount) {

        balance += amount;

        acchistory.add(
                new History(
                        LocalDate.now(),
                        "Interest",
                        amount));
    }

    public String getAccountNumber() {
        return accountnum;
    }

    public double getBasicBalance() {
        return basicbalance;
    }

    public double getBalance() {
        return balance;
    }

    public void showInfo() {

        System.out.println(
                "Account: "
                        + accountnum);

        System.out.println(
                "Balance: "
                        + balance);

        System.out.println(
                "Customer: "
                        + cus.getInfo());

        System.out.println(
                "\nHistory");

        for (History h : acchistory) {

            System.out.println(
                    h.getInfo());
        }
    }

}