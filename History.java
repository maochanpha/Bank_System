import java.time.LocalDate;

public class History {
    private LocalDate transDate;
    private String transName;
    private double amount;

    public History(LocalDate transDate, String transName, double amount) {
        this.transDate = transDate;
        this.transName = transName;
        this.amount = amount;
    }

    public String getInfo() {
        return transDate + " | " + transName + " | $" + amount;
    }

    public LocalDate getTransactionDate() {
        return transDate;
    }

    public String getTransactionName() {
        return transName;
    }

    public double getAmount() {
        return amount;
    }
}