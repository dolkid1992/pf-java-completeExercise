package Account;

import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        System.out.println("Enter blance: ");
        double balance = sc.nextDouble();
        Account account = new Account(id, balance);

        System.out.println("Enter AnnualInterestRate: ");
        double annualInterestRate = sc.nextDouble();
        account.setAnnualInterestRate(annualInterestRate);

        account.setDateCreated(new Date());

        System.out.println("Enter Draw ALL Money: ");
        double withDrawAllMoney = sc.nextDouble();
        account.withDraw(withDrawAllMoney);

        System.out.println("Enter Deposits: ");
        double deposits = sc.nextDouble();
        account.depositMoney(deposits);

        balance = account.getBalance();
        System.out.println("Balance is: " + balance);
        double monthlyInterest = account.getMonthlyInterest();
        System.out.println("Monthly Interest is: " + monthlyInterest);
        String dateCreated = account.getDateCreated().toString();
        System.out.println("Date Created is: " + dateCreated);
    }
}
