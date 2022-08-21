package com.yeexun.paymentdemo.job;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class TestCar {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(5);
        System.out.println("初始总许可数 5");
        WorkerThread workerThread1 = new WorkerThread("worker-thread-1", semaphore);
        WorkerThread workerThread2 = new WorkerThread("worker-thread-2", semaphore);
        workerThread1.start();
        Thread.sleep(20000);
        System.out.println("aaaaa");
        workerThread2.start();
    }


}
