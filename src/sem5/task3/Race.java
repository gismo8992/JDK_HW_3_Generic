package sem5.task3;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Race implements Runnable{
    private CountDownLatch readySignal;
    private CountDownLatch cdlStart;
    private CountDownLatch cdlFinish;

    public Race(CountDownLatch readySignal, CountDownLatch cdlStart, CountDownLatch cdlFinish) {
        this.readySignal = readySignal;
        this.cdlStart = cdlStart;
        this.cdlFinish = cdlFinish;
    }

    @Override
    public void run() {
        try {
            readySignal.await();
            System.out.println("На старт!");
            Thread.sleep(100);
            System.out.println("Внимание!");
            Thread.sleep(100);
            System.out.println("Марш!");
            cdlStart.countDown();
            cdlFinish.await();
            System.out.println("Забег закончен.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
