import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    //多线程下线程安全的计数器
    private static volatile AtomicInteger COUNT = new AtomicInteger();

    @Test
    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0; j<10000; j++){
                        COUNT.incrementAndGet();//++i;
//                        COUNT.getAndIncrement();//i++
                    }
                }
            }).start();
        }
        while(Thread.activeCount() > 1)
            Thread.yield();
        System.out.println(COUNT.get());
    }
}
