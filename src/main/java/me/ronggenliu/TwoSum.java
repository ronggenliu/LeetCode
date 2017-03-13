package me.ronggenliu;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 */
import java.util.HashMap;
import java.util.Map;

class TwoSum
{
    static int[] result(int[] sums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < sums.length; i++) {
            int complement = target - sums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(sums[i], i);
        }
        throw new IllegalArgumentException("No Two Sum solution.");
    }
}
