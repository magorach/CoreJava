package ExceptionHandling;

public class practice {
    public static void main(String[] args) {

        try {
            System.out.println("outer try block");
            try {
                System.out.println("inner try block");
                System.out.println(10/0);
            }
            catch (NullPointerException e){
                System.out.println("inner catch block");
            }finally {
                System.out.println("inner finally block");
            }
            System.out.println("Hii");
        } catch (Exception e) {
            System.out.println("outer catch block");
        }
        finally {
            System.out.println("Outer finally block");
        }

    }
}
