package sem5.hw;

class Philosopher extends Thread {
    private final int id;
    private final Fork leftFork;
    private final Fork rightFork;
    public Philosopher(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                think();
                eat();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    private void think() throws InterruptedException { // вначале философ думает
        System.out.println("Философ " + id + " думает");
        Thread.sleep((long) (Math.random() * 1000));
    }
    private void eat() throws InterruptedException { // затем ест, используя синхронизацию захвата вилок
        synchronized (leftFork) {
            System.out.println("Философ " + id + " берет левую вилку");
            synchronized (rightFork) {
                System.out.println("Философ " + id + " берет правую вилку");
                System.out.println("Философ " + id + " ест");
                Thread.sleep((long) (Math.random() * 1000));
            }
            System.out.println("Философ " + id + " кладет правую вилку");
        }
        System.out.println("Философ " + id + " кладет левую вилку");
    }
}
