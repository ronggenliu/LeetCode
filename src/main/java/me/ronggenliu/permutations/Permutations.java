package me.ronggenliu.permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a collection of distinct integers, return all possible permutations.
 */
public class Permutations {
    public static List<List<Integer>> permutate(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        boolean[] used = new boolean[nums.length];
        backtrack(list, new ArrayList<Integer>(), nums, used);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            System.out.println(tempList);
            list.add(new ArrayList<Integer>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) continue;
                tempList.add(nums[i]);
                used[i] = true;
                backtrack(list, tempList, nums, used);
                tempList.remove(tempList.size() - 1);
                used[i] = false;
            }
        }
    }
}
