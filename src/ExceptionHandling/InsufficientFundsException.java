package ExceptionHandling;

public class InsufficientFundsException extends  Exception {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public InsufficientFundsException(double amount){
        super("What do you want ? You don't have money"); //super("What do you want ? You don't have money") → passes message to parent Exception.
        this.amount = amount;   //this.amount = 110 stores the requested withdrawal amount.
     }
}
