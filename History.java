import java.time.LocalDate;

public class History {
    private LocalDate transdate;
    private String transname;
    private double amount;

    public History(LocalDate transdate, String transname, double amount) {
        this.transdate = transdate;
        this.transname = transname;
        this.amount = amount;
}
public String getInfo(){
    return transdate + " " + transname + " " + amount;
}
}