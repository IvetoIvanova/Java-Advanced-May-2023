package T03BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> accounts = new HashMap<>();
        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Create":
                    BankAccount account = new BankAccount();
                    accounts.put(account.getId(), account);
                    System.out.println("Account ID" + account.getId() + " created");
                    break;
                case "Deposit":
                    int accountId = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);
                    if (accounts.containsKey(accountId)) {
                        accounts.get(accountId).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, accountId);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int accountIdForInterest = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (accounts.containsKey(accountIdForInterest)) {
                        double interestAmount = accounts.get(accountIdForInterest).getInterest(years);
                        System.out.printf("%.2f%n", interestAmount);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "End":
                    System.exit(0);
                    break;
            }

            command = scanner.nextLine();
        }
    }
}