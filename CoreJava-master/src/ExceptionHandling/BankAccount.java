package ExceptionHandling;

import java.io.PrintWriter;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }


     public void withdraw (double amount) throws InsufficientFundsException {
        if (amount > balance){
             throw new InsufficientFundsException(amount);
        }
        balance -= amount;
     }
    // PrintWriter pw = new PrintWriter("ABC.txt");
}
