package me.ronggenliu.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;

/**
 * Unit test for simple PalindromeNumber.
 */
@RunWith(Parameterized.class)
 public class LongestCommonPrefixTest {
  public LongestCommonPrefix longestCommonPrefix;

  public LongestCommonPrefixTest(LongestCommonPrefix lCommonPrefix) {
    this.longestCommonPrefix = lCommonPrefix;
  }

  @Parameters
  public static Collection<Object[]> classes() {
    return Arrays.asList(new Object[][] {
      { new LongestCommonPrefixImpl1() },
      { new LongestCommonPrefixImpl2() }
    });
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
