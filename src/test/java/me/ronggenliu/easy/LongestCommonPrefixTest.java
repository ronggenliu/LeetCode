package me.ronggenliu.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

/**
 * Unit test for simple PalindromeNumber.
 */
@RunWith(Parameterized.class)
public class LongestCommonPrefixTest {
  @Parameter
  public LongestCommonPrefix longestCommonPrefix;

  @Parameter(1)
  public String clazz;

  @Parameters(name = "{index}: test for impl {1}")
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][]{
            {new LongestCommonPrefixImpl1(), "Vertical Scanning solution"},
            {new LongestCommonPrefixImpl2(), "Horizontal Scanning solution"},
            {new LongestCommonPrefixImpl3(), "Divide Conquer solution"},
            {new LongestCommonPrefixImpl4(), "Binary Search solution"}
    });
  }

  @Test
  public void testResultWithResult() {
    assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"c", "ac", "cc"}));
    assertEquals("dog", longestCommonPrefix.longestCommonPrefix(new String[]{"dog"}));
    assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{}));
  }
}
