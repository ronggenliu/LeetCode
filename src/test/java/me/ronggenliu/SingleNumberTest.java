package me.ronggenliu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by liuronggen on 13/03/2017.
 */
public class SingleNumberTest {
    @Test
    public void solution() throws Exception {
        assertTrue(SingleNumber.solution(new int[]{1}, 1) == 1);
        assertTrue(SingleNumber.solution(new int[]{1, 2, 1}, 3) == 2);
        assertTrue((2 ^ 1 ^ 1) == 2);
    }

}