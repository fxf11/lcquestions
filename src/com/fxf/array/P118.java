package com.fxf.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2021/5/21 13:58
 * @Version 1.0
 * 118. 杨辉三角
 *
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */
public class P118 {

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(15);
        System.out.println(generate.toString());
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            //判断是不是第一行，如果是第一行就直接添加1
            if( i == 0){
                list.add(1);
            }else{
                List<Integer> list1 = ans.get(i-1);
                int size = list1.size() + 1;
                //判断是不是第一个或者最后一个，如果是就直接添加1
                for(int j = 0; j < size; j++){
                    if(j == 0 || j == size-1){
                        list.add(1);
                    }else{
                        //不是的话就获取上一行的数据 左上方和右上方的值加起来添加进去
                        list.add(list1.get(j-1) + list1.get(j));

                    }

                }
            }

            ans.add(list);
        }
        return ans;
    }
}
