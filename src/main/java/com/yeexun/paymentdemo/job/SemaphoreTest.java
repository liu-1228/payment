package com.yeexun.paymentdemo.job;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    public static void main(String[] args) {
        int max=3;//许可数量

        Semaphore sp =new Semaphore(3);

        for(int i=0;i<max*10;i++){
            new WeAreProgramer(sp).start();
        }
    }
}

class WeAreProgramer extends Thread{

    private Semaphore sp =null;

    public WeAreProgramer(Semaphore sp) {
        this.sp = sp;
    }

    //    public  WeAreProgramer(){
//        this.sp = sp;
//    }
    @Override
    public void run() {
        System.out.println("到达地铁口，获许可 线程" +Thread.currentThread().getName());
        try {
            sp.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("获取到许可，进站 线程= "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("上车 线程=" +Thread.currentThread().getName());

        sp.release();

    }
}
