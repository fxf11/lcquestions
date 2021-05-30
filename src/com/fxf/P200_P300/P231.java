package com.fxf.P200_P300;

/**
 * @author 饭小范
 * @version 1.0
 * @description: TODO
 * @date 2021/5/30 21:25
 *
 * 231. 2 的幂
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。
 *
 *评论题解
 */
public class P231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        if(n == 0 || n<0){
            return false;
        }
        while(n>0){
            if(n%2 != 0){
                return false;
            }
            if(n == 2){
                return true;
            }
            n/=2;
        }
        return true;
    }
}
