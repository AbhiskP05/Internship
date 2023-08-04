package com.InternshipFlipRobo;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            Integer complementsIndex =complements.get(nums[i]);
            if(complementsIndex!=null) {
                return new int[]{i, complementsIndex};
            }
                complements.put(target-nums[i],1);
        }
        return nums;
    }
}


