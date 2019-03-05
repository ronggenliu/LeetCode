package me.ronggenliu.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple PalindromeNumber.
 */
@RunWith(Parameterized.class)
 public class LongestCommonPrefixTest {
  @Parameter
  public LongestCommonPrefix longestCommonPrefix;

  @Parameters
  public static Object[] data() {
    return new Object[] {
      new LongestCommonPrefixImpl1(),
      new LongestCommonPrefixImpl2()
    };
  }

  @Test
  public void testResultWithResult() {
    assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"c","ac","cc"}));
    assertEquals("dog", longestCommonPrefix.longestCommonPrefix(new String[]{"dog"}));
    assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{}));
  }
}
