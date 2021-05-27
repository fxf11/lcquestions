package com.fxf.P401_500;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2021/5/27 9:40
 * @Version 1.0
 *
 * P461汉明距离
 *
 * 计算出两个整数之间的汉明距离
 * 汉明距离指的是两个值相对应的二进制相同位置值不同的数目
 */
public class P461_HammingDistance {

    public static void main(String[] args) {

        System.out.println(hammingDistance(3,8));

    }
    public static int hammingDistance(int x, int y) {
        //计算出异或值，异或后的值二进制中1的位数就为汉明距离
        x = x^y;
        int count = 0;
        while (x != 0){
            // 0001  1
            // 0101  5
            //判断按位与是否为1，如果等于1，则代表异或后的值的最后一位为1，
            if ((x&1) == 1){
                count++;
            }
            // 0010
            //将二进制位右移一位，下一次循环判断二进制中下一位是否为1
            x = x >> 1;
        }

        return count;
    }
}
