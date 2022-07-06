package com.fian.learn.coding.twosum;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] num= {1,3,5,6};
        int target = 7;
        twoSumHashMap(num, target);

    }

    public static int[] twoSumLoop(int[] nums, int target){
        int panjang = nums.length;
        for (int i = 0; i < panjang; i++) {
            int complement = target-nums[i];
            for (int j = i+1; j < panjang; j++) {
                if(nums[j] == complement){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public static int[] twoSumHashMap(int[] nums, int target){
        int panjang = nums.length;
        for (int i: nums){
            System.out.print(i);
        }
        System.out.println();
        System.out.println("target : "+target);
        System.out.println("======");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < panjang; i++) {
            System.out.println(">>>>>>>>>>>>>>>> i = "+i);
            int complement = target-nums[i];
            System.out.println("complement : "+complement);
            if(hashMap.containsKey(complement)){
                System.out.println(hashMap);
                System.out.println(hashMap.get(complement)+" , "+i);
                System.out.println("MATCHES");
                return new int[] {hashMap.get(complement), i};
            }else{
                System.out.println("No match");
            }
            System.out.println("put to hashmap");
            System.out.println(nums[i]+" : "+i);
            hashMap.put(nums[i], i);
            System.out.println("<<<<<<<< Hashmap >>>>>>>>>");
            System.out.println(hashMap.toString());
        }
        return new int[] {};
    }
}
