package com.yeexun.paymentdemo.java8.lambad;

public class LambdaDemo01 {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("running");
//            }
//        }).start();

        new Thread(()->{
            System.out.println("running");
        }).start();
    }
}
