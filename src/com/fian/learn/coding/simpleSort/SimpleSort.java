package com.fian.learn.coding.simpleSort;

public class SimpleSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        int length = nums.length;
        SimpleSort s = new SimpleSort();
        s.formatArray(nums, length);
    }

    /**
     * odd bigger than previous even
     * @param a
     * @param n
     * @return
     */
    public int[] formatArray(int[] a,int n){
        // add code here.
        for(int i=0;i<n;i+=2){
            if(i<n-1&&a[i]>a[i+1]){
                a[i]+=a[i+1];
                a[i+1]=a[i]-a[i+1];
                a[i]-=a[i+1];
            }
        }
        return a;
    }
}
