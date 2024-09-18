package sem5.task3;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Runner implements Runnable{
    private String name;
    private CountDownLatch readySignal;
    private CountDownLatch cdlStart;
    private CountDownLatch cdlFinish;

    public Runner(String name, CountDownLatch readySignal, CountDownLatch cdlStart, CountDownLatch cdlFinish) {
        this.name = name;
        this.readySignal = readySignal;
        this.cdlStart = cdlStart;
        this.cdlFinish = cdlFinish;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(3000));
            System.out.println("Участники " + this.name + " на старте");
            readySignal.countDown();
            cdlStart.await();
            System.out.println("Участник " + this.name + " побежал");
            Thread.sleep(new Random().nextInt(5000));
            System.out.println("Участник " + this.name + " финишировал");
            cdlFinish.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
