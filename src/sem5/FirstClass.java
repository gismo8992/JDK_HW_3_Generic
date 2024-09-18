package sem5;

public class FirstClass implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.print("1 ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
