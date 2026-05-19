public class RetailLoan
        extends BankAccount {

    private double loanAmount;

    private double yir;

    public RetailLoan() {
    }

    public RetailLoan(
            String accountnum,
            double loanAmount,
            double yir) {

        super(accountnum,0);

        this.loanAmount =
                loanAmount;

        this.yir = yir;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getYearlyInterestRate() {
        return yir;
    }

}