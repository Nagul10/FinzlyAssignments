package bank;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    CheckingAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        setBalance(balance+amount);
    }

    @Override
    public void withdraw(double amount) {
        if(balance-amount<overdraftLimit){
            System.out.println("You can't withdraw money");
            System.out.println("overdraft limit reached");
        }
        else {
            setBalance(balance-amount);
        }
    }
}
