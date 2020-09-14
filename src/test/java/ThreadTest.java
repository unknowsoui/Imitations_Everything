import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class ThreadTest {
    private static volatile int COUNT;

    public static void main(String[] args) {

    }

    @Test
    public void test() throws InterruptedException {
        Semaphore semaphore = new Semaphore(0);
        for(int i = 0;i < 5;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0;j < 10000;j++){
                        COUNT++;
                    }
                    semaphore.release(1);
                }
            });
            thread.start();

        }
        semaphore.acquire(5);
        System.out.println(COUNT);
    }

    @Test
    public void test1() throws InterruptedException {
        for(int i = 0;i < 5;i++){
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0;j < 10000;j++){
                        COUNT++;
                    }
                    countDownLatch.countDown();
                }
            });
            thread.start();
            countDownLatch.await();
        }
        System.out.println(COUNT);
    }
}
