package ExceptionHandling;

public class TestEH {

    static ArithmeticException e = new ArithmeticException();

    public static void main(String[] args) {
//       divide(1,0);
        BankAccount bankAccount = new BankAccount(100);
        try{bankAccount.withdraw(110);}
        catch (InsufficientFundsException e){
            System.out.println(e+ "  \nAmount is :"+ " " + e.getAmount());
        }

        // checked exception - Interrupted
//        System.out.println("I want to sleep");
//        Thread.sleep(100);



    }
    public static void divide( int a , int b){
        try{
            System.out.println("in try block ");
            int result =  a/b;
      }
        catch ( Exception o){
            System.out.println("Exception caught : "+ o);
        }finally {
            System.out.println("Inside finally block");
        }

    }
}