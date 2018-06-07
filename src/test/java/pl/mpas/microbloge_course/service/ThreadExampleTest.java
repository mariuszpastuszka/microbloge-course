package pl.mpas.microbloge_course.service;

import org.junit.Test;

import java.util.concurrent.Executor;

public class ThreadExampleTest {
    private Executor executor;

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
}
