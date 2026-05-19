import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(
            String[] args) {

        Scanner input =
                new Scanner(System.in);

        System.out.print(
                "Customer ID: ");

        String cusId =
                input.nextLine();

        System.out.print(
                "First Name: ");

        String fname =
                input.nextLine();

        System.out.print(
                "Last Name: ");

        String lname =
                input.nextLine();

        System.out.print(
                "Gender: ");

        String gender =
                input.nextLine();

        System.out.print(
                "Address: ");

        String address =
                input.nextLine();

        System.out.print(
                "Phone: ");

        String phone =
                input.nextLine();

        Customer customer =
                new Customer(
                        cusId,
                        fname,
                        lname,
                        gender,
                        LocalDate.now(),
                        address,
                        phone);

        System.out.println(
                "\nCURRENT SAVING");

        System.out.print(
                "Account Number: ");

        String csAcc =
                input.nextLine();

        System.out.print(
                "Amount: ");

        double amount =
                input.nextDouble();

        System.out.print(
                "YIR: ");

        double yir =
                input.nextDouble();

        CurrentedSaving cs =
                new CurrentedSaving(
                        csAcc,
                        LocalDate.now(),
                        yir,
                        amount);

        cs.setCustomer(
                customer);

        System.out.print(
                "Deposit: ");

        double dep =
                input.nextDouble();

        cs.deposit(dep);

        System.out.print(
                "Withdraw: ");

        double wd =
                input.nextDouble();

        cs.withdrawal(wd);

        System.out.print(
                "Interest: ");

        double in =
                input.nextDouble();

        cs.interest(in);

        System.out.println(
                "\nRESULT");

        cs.showInfo();

    }

}