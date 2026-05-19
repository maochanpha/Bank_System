import java.time.LocalDate;

public class FixedSaving
        extends BankAccount {

    private LocalDate startdate;

    private int numberofMonth;

    private double yir;

    public FixedSaving() {
    }

    public FixedSaving(
            String accountnum,
            LocalDate startdate,
            int numberofMonth,
            double yir,
            double amount) {

        super(
                accountnum,
                amount);

        this.startdate = startdate;

        this.numberofMonth =
                numberofMonth;

        this.yir = yir;
    }

    public LocalDate getEndDate() {

        return startdate.plusMonths(
                numberofMonth);
    }

    public LocalDate getStartDate() {
        return startdate;
    }

    public int getNumberOfMonth() {
        return numberofMonth;
    }

    public double getYearlyInterestRate() {
        return yir;
    }

}