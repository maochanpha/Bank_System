import java.time.LocalDate;

public class Customer {
    private String cus_id;
    private String fname;
    private String lname;
    private String gender;
    private LocalDate birthdate;
    private String address;
    private String phone;

    public Customer(String cus_id, String fname, String lname, String gender,
                    LocalDate birthdate, String address, String phone) {
        this.cus_id = cus_id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
    }

    public String getInfo() {
        return cus_id + " - " + fname + " " + lname + " (" + gender + ")";
    }
}