package com.fian.learn.coding.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        int[] nums = {1,7,8,4,5};
        int target = 1;
        int[] result = TwoSum.twoSumHashMap(nums, target);
        assertArrayEquals(result, new int[] {});

        int[] nums1 = {1,7,8,4,5};
        int target1 = 6;
        int[] result1 = TwoSum.twoSumHashMap(nums1, target1);
        assertArrayEquals(result1, new int[] {0,4});
    }
}