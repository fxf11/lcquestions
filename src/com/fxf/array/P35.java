package com.fxf.array;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2021/5/14 15:01
 * @Version 1.0
 *
 * 搜索插入位置
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置
 */
public class P35 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8};
        System.out.println(arr);
        searchInsert(arr,6);
        int i = searchInsert2(arr, 9);
        System.out.println(i);
    }
    //暴力解法
    public static int searchInsert(int[] nums, int target) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                j = i;
            }
            if(target > nums[i]){
                j = i+1;
            }
            if(target > nums[nums.length-1]){
                return nums.length;
            }
        }
        return j;
    }

    //二分查找法
    public static int searchInsert2(int[] nums, int target) {
        System.out.println(Arrays.toString(nums));
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            //如果你要查找的元素比中间索引所对应的元素大 那么就动最小索引
            if (nums[mid] < target){
                left = mid + 1;
                //如果你要查找的元素比中间索引所对应的元素大 那么就动最小索引
            }else if (nums[mid] > target){
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return left;
    }

}
