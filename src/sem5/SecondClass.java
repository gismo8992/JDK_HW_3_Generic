package sem5;

public class SecondClass extends Thread {

    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            try {
                Thread.sleep(1000);
                System.out.print("2 ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
