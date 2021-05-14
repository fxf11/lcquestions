package com.fxf.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2021/5/13 10:03
 * @Version 1.0
 */
//删除有序数组的重复项
/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
  */
public class P26 {
    public static void main(String[] args) {
        int arr[] = {1,1,3,4};
        int i = removeDuplicates(arr);
    }
    //双指针法，定义两个指针，一个快指针一个慢指针，起始位置相同
    public static int removeDuplicates(int[] nums) {
        if (nums==null || nums.length==0){
            return 0;
        }
        int a = 0;//慢指针
        for(int b = 0; b < nums.length; b++){
            //判断快慢指针所指向的值是否相同，如果相同，快指针后移一位
            // 如果不相同慢指针后移一位，并且将快指针指向的值赋值给慢指针移动后指向的值
            if(nums[a] != nums[b]){
                a++;
                nums[a] = nums[b];
            }
        }
        return a+1;
    }
}
