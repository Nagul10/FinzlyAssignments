package bank;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("1011101","Nagul",20000);
        CheckingAccount checkingAccount = new CheckingAccount("20202002","Ethan",10000);
        savingsAccount.withdraw(2000);
        System.out.println("Balance amount :" + savingsAccount.getBalance());
        savingsAccount.deposit(6000);
        System.out.println("Balance amount :" + savingsAccount.getBalance());
        savingsAccount.withdraw(30000);
        System.out.println("Balance amount :" + savingsAccount.getBalance());

        checkingAccount.deposit(1000);
        System.out.println("Balance amount :" + checkingAccount.getBalance());
        checkingAccount.withdraw(10000);
        System.out.println("Balance amount :" + checkingAccount.getBalance());
    }
}
