// Que - 3 Write a Java program that uses the ReentrantLock class to synchronize access to a shared resource among multiple threads. without function

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    public static void main(String[] args) {
        final int numThreads = 5;
        final int numIncrements = 500;

      
        final int[] counter = {0};
		
        ReentrantLock lock = new ReentrantLock();

       
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < numIncrements; j++) {
                        lock.lock();
                        try {
                            counter[0]++;
                        } finally {
                            lock.unlock();
                        }
                    }
                }
            });
            threads[i].start();
        }
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Counter value: " + counter[0]);
    }
}