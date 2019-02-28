package me.ronggenliu.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

/**
 * Unit test for simple PalindromeNumber.
 */
public class LongestCommonPrefixTest {
  private LongestCommonPrefix longestCommonPrefix = null;

  @Before
  public void setup() {
    longestCommonPrefix = new LongestCommonPrefix();
  }

  @Test
  public void testResultWithResult() {
    assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    assertEquals("dog", longestCommonPrefix.longestCommonPrefix(new String[]{"dog"}));
    assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{}));
  }
}
