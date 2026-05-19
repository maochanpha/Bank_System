import java.time.LocalDate;

public class CurrentedSaving
        extends BankAccount {

    private LocalDate startdate;

    private double yir;

    public CurrentedSaving() {
    }

    public CurrentedSaving(
            String accountnum,
            LocalDate startdate,
            double yir,
            double amount) {

        super(
                accountnum,
                amount);

        this.startdate = startdate;
        this.yir = yir;
    }

    public void setStartDate(
            LocalDate startdate) {

        this.startdate = startdate;
    }

    public void setYearlyInterestRate(
            double yir) {

        this.yir = yir;
    }

    public LocalDate getStartDate() {
        return startdate;
    }

    public double getYearlyInterestRate() {
        return yir;
    }

}