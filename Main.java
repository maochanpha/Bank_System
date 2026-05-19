import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== INPUT CUSTOMER =====
        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();

        System.out.print("Enter First Name: ");
        String fname = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lname = sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Birthdate (yyyy-mm-dd): ");
        String dateInput = sc.nextLine();
        LocalDate birthdate = LocalDate.parse(dateInput);

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        Customer c = new Customer(id, fname, lname, gender, birthdate, address, phone);

        // ===== INPUT ACCOUNT =====
        System.out.print("\nEnter Account Number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double basicBalance = sc.nextDouble();

        BankAccount acc = new BankAccount(accNum, basicBalance);
        acc.setCustomer(c);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Add Interest");
            System.out.println("4. Show Account Info");
            System.out.println("5. Show History");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double wit = sc.nextDouble();
                    acc.withdrawal(wit);
                    break;

                case 3:
                    System.out.print("Enter interest amount: ");
                    double in = sc.nextDouble();
                    acc.interest(in);
                    break;

                case 4:
                    acc.showAccountInfo();
                    break;

                case 5:
                    acc.showHistory();
                    break;

                case 0:
                    System.out.println("Exit program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}