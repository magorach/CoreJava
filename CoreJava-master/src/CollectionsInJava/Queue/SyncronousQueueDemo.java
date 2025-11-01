package CollectionsInJava.Queue;

import java.util.Stack;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SyncronousQueueDemo {
    public static void main(String[] args) {

        BlockingQueue<String> queue = new SynchronousQueue<>();
        Thread producer = new Thread(()->{
            try {
                System.out.println("Producer is waiting to transfer...");
                queue.put("Hello from Producer");
                System.out.println("Producer has transferred the message. ");
            }catch (InterruptedException e){
                Thread.currentThread().start();
                System.out.println("Producer was interrupted");
            }
        });
        Thread consumer = new Thread(()->{
            try {
                    System.out.println("Consumer is waiting to receive.....");
                    String message = queue.take();
                System.out.println("Consumer received: "+ message);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                System.out.println("Consumer was interrupted");
                }
        });
        producer.start();
        consumer.start();
    }
}
