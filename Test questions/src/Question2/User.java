package Question2;

public class User {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount(10110101,"Nagul",10000);
        bk.deposit(2000);
        bk.printBalance();
        bk.withdraw(3000);
        bk.printBalance();
    }

}
