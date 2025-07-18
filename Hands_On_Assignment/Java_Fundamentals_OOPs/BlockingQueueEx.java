package tasksprograms;

import java.util.concurrent.*;

//Producer thread
class Producer implements Runnable {
 private BlockingQueue<Integer> queue;

 public Producer(BlockingQueue<Integer> q) {
     this.queue = q;
 }

 public void run() {
     try {
         for (int i = 1; i <= 5; i++) {
             System.out.println("Produced: " + i);
             queue.put(i);  // blocks if queue is full
             Thread.sleep(500);
         }
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}

//Consumer thread
class Consumer implements Runnable {
 private BlockingQueue<Integer> queue;

 public Consumer(BlockingQueue<Integer> q) {
     this.queue = q;
 }

 public void run() {
     try {
         while (true) {
             int item = queue.take();  // blocks if queue is empty
             System.out.println("Consumed: " + item);
             Thread.sleep(1000);
         }
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}

//Main class
public class BlockingQueueEx {
 public static void main(String[] args) {
     BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3); // max size 3

     Thread producer = new Thread(new Producer(queue));
     Thread consumer = new Thread(new Consumer(queue));

     producer.start();
     consumer.start();
 }
}
