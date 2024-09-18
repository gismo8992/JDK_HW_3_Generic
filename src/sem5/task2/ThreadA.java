package sem5.task2;

import java.awt.*;

public class ThreadA implements Runnable{
    private volatile Boolean switcher = false;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                setSwitcher(!switcher);
                System.out.println(switcher);
            } catch (InterruptedException e) {
                System.out.println("Программа закончила работу!");
                break;
            }
        }

    }
    public Boolean isSwitcher() {
        return this.switcher;
    }
    public void setSwitcher(Boolean switcher) {
        this.switcher = switcher;
    }
}
