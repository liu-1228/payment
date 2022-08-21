package com.yeexun.paymentdemo.java8.lambad;

import java.util.function.Function;

public class LambdaDemo04 {
    public static void main(String[] args) {
        // 匿名内部类方式
        /*Integer result = typeConver(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        });
        System.out.println(result);*/

        /*String str1 = typeConver(new Function<String, String>() {
            @Override
            public String apply(String str2) {
                return str2 + "上山！";
            }
        });
        System.out.println(str1);*/

        // Lambda方式
        Integer result = typeConver((String s) ->{
            return Integer.valueOf(s);
        });
        System.out.println(result);

        String str1 = typeConver((String str2) ->
                str2 + "上山！"
        );
        System.out.println(str1);
    }
    public static <R>R typeConver(Function<String,R> function) {
        String str = "12345";
        R result = function.apply(str);
        return result;
    }
}