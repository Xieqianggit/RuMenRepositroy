package com.xieqiang.leetcode.suanfa;

import java.util.Arrays;

/**
 * @author 谢强
 * @date 2020-05-18 16:19
 */
public class ChengJiMaxZiShuZu {

    public static void main(String[] args) {

    }


    public int maxProduct(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){

                continue;
            }

        }
        return  0;
    }

    public int[] ziShuZu(int[] arr){
        int min=arr[0],ji=0,max=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<0) {ji++; max=i;}
            if(ji==1) min=i;
        }
        if(ji%2==0) return  arr;
       else {
           if(arr[min]-arr[max]>0){
               int[] as=null;
               for (int i = 0; i < max-1; i++) {

               }
               return arr;
           }
           else if(arr[min]-arr[max]==0){

           }
           else {

           }
        }
        return  null;
    }


    public int jiecheng(int []s){
        for (int i = 0; i <s.length-1 ; i++) {

        }
        return  0;
    }
}
