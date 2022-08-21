package com.yeexun.paymentdemo.java8.lambad;

import java.util.function.IntBinaryOperator;

public class LambdaDemo02 {
    public static void main(String[] args) {
        // 匿名内部类方式
        /*int result = calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println(result);*/

        // lambda表达式
        int result = calculateNum((left, right) ->{
            return left + right;
        });
        System.out.println(result);
    }
    public static int calculateNum(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a,b);
    }
}
