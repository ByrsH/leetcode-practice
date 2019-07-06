package org.yrs.towSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 18:44 2019/7/6
 * @Modified By:
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (map.containsKey(tmp)) {
                result[0] = map.get(tmp);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 10};
        System.out.println(twoSum(nums, 9));
    }
}
