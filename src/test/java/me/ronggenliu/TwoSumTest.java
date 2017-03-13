package me.ronggenliu;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple TwoSum.
 */
public class TwoSumTest
{
    @Test(expected = IllegalArgumentException.class)
    public void testResultWithNoSolutionException()
    {
        int[] sums = new int[]{2,3,9};
        TwoSum.result(sums, 6);
    }

    @Test
    public void testResultWithResult()
    {
        int[] sums = new int[]{2,3,4};
        TwoSum.result(sums, 6);
        assertEquals(true, TwoSum.result(sums, 6)[0] == 0 && TwoSum.result(sums, 6)[1] == 2);
    }
}
