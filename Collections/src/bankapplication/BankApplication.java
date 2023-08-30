package bankapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
    static Scanner sc = new Scanner(System.in);
    static List<BankAccount> bankAccounts = new ArrayList<>();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            System.out.println("-----------------------------------");
            System.out.println("Bank Account Management System");
            System.out.println("1. Create Accounts");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Check Balances");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.println("-----------------------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    createAccount();
                    break;
                case 2 :
                    depositFunds();
                    break;
                case 3 :
                    withdrawFunds();
                    break;
                case 4 :
                    checkBalance();
                    break;
                case 5 :
                    listAllAccounts();
                    break;
                case 6 :
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice !!!");
            }
        }
    }

    private static void listAllAccounts() {
        for (BankAccount account : bankAccounts){
            System.out.println(account.toString());
        }
    }

    private static void checkBalance() {
        System.out.println("Enter Account Number");
        int accountNumber = sc.nextInt();
        for (BankAccount account : bankAccounts){
            if(account.getAccountNumber() == accountNumber){
                System.out.println("Balance : "+ account.getBalance());
                return;
            }
        }
    }

    private static void withdrawFunds() {
        System.out.println("Enter Account Number");
        int accountNumber = sc.nextInt();
        System.out.println("Enter Withdraw Amount");
        double amount = sc.nextDouble();
        for (BankAccount account : bankAccounts){
            if(account.getAccountNumber() == accountNumber){
                account.withdraw(amount);
                return;
            }
        }
    }

    private static void depositFunds() {
        System.out.println("Enter Account Number");
        int accountNumber = sc.nextInt();
        System.out.println("Enter Deposit Amount");
        double amount = sc.nextDouble();
        for (BankAccount account : bankAccounts){
            if(account.getAccountNumber() == accountNumber){
                account.deposit(amount);
                return;
            }
        }
    }

    private static void createAccount() {
        System.out.println("Enter Account Number");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account Holder Name");
        String name = sc.nextLine();
        System.out.println("Enter Account Balance");
        double balance = sc.nextDouble();
        bankAccounts.add(new BankAccount(accountNumber,name,balance));
        System.out.println("Bank Account Created");
    }
}
