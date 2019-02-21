package me.ronggenliu.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

/**
 * Unit test for simple TwoSum.
 */
public class ReverseIntegerTest {
  private ReverseInteger reverseInteger = null;

  @Before
  public void setup() {
    reverseInteger = new ReverseInteger();
  }

  @Test
  public void testResultWithResult() {
    int ret = reverseInteger.reverse(123);
    assertEquals(321, ret);
    ret = reverseInteger.reverse(1234);
    assertEquals(4321, ret);
    ret = reverseInteger.reverse(-123);
    assertEquals(-321, ret);
    ret = reverseInteger.reverse(-1234);
    assertEquals(-4321, ret);
    ret = reverseInteger.reverse(120);
    assertEquals(21, ret);
    ret = reverseInteger.reverse(1534236469);
    assertEquals(0, ret);
  }
}
