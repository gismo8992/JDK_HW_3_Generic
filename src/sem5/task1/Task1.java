package sem5.task1;
/*
В рамках выполнения задачи необходимо:
● Создать два класса ObjectA, ObjectB
● Реализовать класс в котором два потока при запуске провоцируют DeadLock для
объектов ObjectA, ObjectB
 */

public class Task1 {
    static Object objectA = new Object();
    static Object objectB = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> workThread1());
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                workThread2();
            }
        };

        thread1.start();
        thread2.start();

    }

    public static void workThread1() {
        synchronized (objectA) {
            try {
                System.out.println("Поток 1 захватил объект А");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (objectB) {
                System.out.println("Поток 1 захватил объект B");
            }
        }
    }

    public static void workThread2() {
        synchronized (objectB) {
            System.out.println("Поток 2 захватил объект B");
            synchronized (objectA) {
                System.out.println("Поток 2 захватил объект A");
            }
        }
    }
}
