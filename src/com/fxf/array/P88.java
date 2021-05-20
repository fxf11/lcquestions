package com.fxf.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2021/5/20 11:12
 * @Version 1.0
 *
 * 力扣p88：合并两个有序数组
 *
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P88 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3; int[] nums2 = {2,5,6};int n = 3;


        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m ; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < n ; i++) {
            list.add(nums2[i]);
        }
        Object[] objects = list.toArray();
        Arrays.sort(objects);

        System.out.println(Arrays.toString(objects));
//        for (int i = m, j = 0; i < m + n; i++, j++) {
//            nums1[i] = nums2[j];
//        }
//        Arrays.sort(nums1);
    }
}
