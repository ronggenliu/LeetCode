package me.ronggenliu.easy;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;

/**
 * Unit test for simple TwoSum.
 */
public class TwoSumTest
{
    private TwoSum twoSum = null;
    
    @Before
    public void setup() {
        twoSum = new TwoSum();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResultWithNoSolutionException()
    {
        int[] nums = new int[]{2,3,9};
        twoSum.twoSum(nums, 7);
    }

    @Test
    public void testResultWithResult()
    {
        int[] nums = new int[]{2,3,4};
        twoSum.twoSum(nums, 6);
        assertTrue(twoSum.twoSum(nums, 6)[0] == 0 && twoSum.twoSum(nums, 6)[1] == 2);
    }
}
