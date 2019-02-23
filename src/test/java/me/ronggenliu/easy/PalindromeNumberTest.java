package me.ronggenliu.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

/**
 * Unit test for simple PalindromeNumber.
 */
public class PalindromeNumberTest {
  private PalindromeNumber palindromeNumber = null;

  @Before
  public void setup() {
    palindromeNumber = new PalindromeNumber();
  }

  @Test
  public void testResultWithResult() {
    assertTrue(palindromeNumber.isPalindrome(1));
    assertFalse(palindromeNumber.isPalindrome(-12));
    assertFalse(palindromeNumber.isPalindrome(10));

  }
}
