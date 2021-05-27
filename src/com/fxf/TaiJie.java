package com.fxf;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2021/5/26 14:01
 * @Version 1.0
 *
 * 上台阶题目
 */
public class TaiJie {


    public static void main(String[] args) {
        System.out.println(loop(6));
    }

    //循环迭代的方法
    public static int loop(int n){

        if (n < 1){
            throw new IllegalArgumentException(n + "不能小于一");
        }

        if (n == 1 || n == 2){
            return n;
        }

        int one = 2;
        int two = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = two + one;
            two = one;
            one = sum;

        }
        return sum;
    }
}
