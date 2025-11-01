package LambdaExpressionLearning;

public class ThreadDemo {
    public static void main(String[] args) {


        // thread ki implementation
        Runnable thread1 = ()->{
            for ( int i = 1; i<= 5;i++){
                System.out.println("Value is " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(thread1);
        thread.setName("JOHN");
        thread.start();

    }
}
