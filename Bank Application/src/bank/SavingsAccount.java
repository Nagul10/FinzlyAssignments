package bank;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
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
        setBalance(getBalance()+amount);
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance()-amount<1000){
            System.out.println("You cannot withdraw amount");
            System.out.println("Its below the minimum amount");
        }
        else {
            setBalance(getBalance()-amount);
        }
    }
}
