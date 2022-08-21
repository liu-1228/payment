package com.yeexun.paymentdemo.job;

import java.util.concurrent.Semaphore;

class WorkerThread extends Thread {

    private String name;
    private Semaphore semaphore;

    public WorkerThread(String name, Semaphore semaphore) {
        this. name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " 尝试获取许可.");
            // 获取许可证
            semaphore.acquire();
            System.out.println(this.name + " 获取许可成功，当前许可还剩 " + semaphore.availablePermits());
            Thread.sleep(3000);
            System.out.println(this.name + " 尝试释放许可.");
            // 释放许可证
            semaphore.release();
            System.out.println(this.name + " 释放许可成功，当前许可还剩 " + semaphore.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
