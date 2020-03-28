package com.gujun.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution0001 {

    public int[] towSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target-nums[i])) {
                return new int[] {map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        int[] ret = new Solution0001().towSum(nums, target);
        for (int i = 0; i < ret.length; ++i) {
            System.out.println(ret[i]);
        }
    }

}
