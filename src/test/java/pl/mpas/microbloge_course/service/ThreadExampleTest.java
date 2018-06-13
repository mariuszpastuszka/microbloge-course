package pl.mpas.microbloge_course.service;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadExampleTest {
    private Executor executor;

    class Job implements Runnable {

        @Override
        public void run() {

        }
    }

    interface JobToDo {
        boolean makeJob(String name);
    }

    Runnable job = new Runnable() {
        @Override
        public void run() {
            System.out.println("Current thread name: " + Thread.currentThread().getName());
            System.out.println("Mariusz");
        }
    };

    @Test
    public void sendJobToExecutor() {
        System.out.println("Current thread name: " + Thread.currentThread().getName());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Current thread name: " + Thread.currentThread().getName());
                System.out.println("Mariusz");
            }
        }).start();
    }

    @Test
    public void threadWithLambda() {
        System.out.println("threadWithLambda() current thread name: " + Thread.currentThread().getName());

        Runnable job = () -> {
            System.out.println("Current thread name: " + Thread.currentThread().getName());
            System.out.println("Mariusz");
        };

        Thread worker = new Thread(job);
        worker.start();
    }

    @Test
    public void executorThread() {
        Executor executor = Executors.newFixedThreadPool(4);
        Runnable job = () -> {
            System.out.println("Sending emails from thread: " + Thread.currentThread().getName());
        };

        for (int i = 0; i < 100; i++) {
            executor.execute(job);
        }
    }
}
