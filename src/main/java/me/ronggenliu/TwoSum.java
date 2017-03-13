package me.ronggenliu;

/**
 * Hello world!
 *
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum 
{
    public static int[] result(int[] sums, int target) {
        Map<Integer, Integer> map = new HashMap();
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
