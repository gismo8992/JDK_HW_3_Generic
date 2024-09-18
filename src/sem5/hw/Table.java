package sem5.hw;
class Table {
    private final Fork[] forks;
    private final Philosopher[] philosophers;
    public Table(int numPhilosophers) {
        forks = new Fork[numPhilosophers];
        philosophers = new Philosopher[numPhilosophers];
        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Fork(i+1);
        }
        for (int i = 0; i < numPhilosophers; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % numPhilosophers];
            philosophers[i] = new Philosopher(i+1, leftFork, rightFork);
        }
    }
    public void startEating() {
        for (Philosopher philosopher : philosophers) { // запускаем поток философов
            philosopher.start();
        }
        for (Philosopher philosopher : philosophers) { // и ожидаем завершения
            try {
                philosopher.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
