package sem5;

public class MyClass {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new FirstClass());
        thread1.start();
        // thread1.join(); - потоки 2, 3 буду ждать завершения потока 1
        SecondClass thread2 = new SecondClass();
        thread2.start();
        //thread2.interrupt();

        Runnable task_thread3 = () -> {
            for (int k = 0; k < 10; k++) {
                try {
                    Thread.sleep(1000);
                    System.out.print("3 ");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread3 = new Thread(task_thread3);
        thread3.start();
    }

}

