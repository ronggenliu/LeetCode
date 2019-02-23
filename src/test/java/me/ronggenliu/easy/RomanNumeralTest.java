package me.ronggenliu.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

/**
 * Unit test for simple PalindromeNumber.
 */
public class RomanNumeralTest {
  private RomanNumeral romanNumeral = null;

  @Before
  public void setup() {
    romanNumeral = new RomanNumeral();
  }

  @Test
  public void testResultWithResult() {
    assertEquals(3, romanNumeral.romanToInt("III"));
    assertEquals(4, romanNumeral.romanToInt("IV"));
    assertEquals(9, romanNumeral.romanToInt("IX"));
    assertEquals(58, romanNumeral.romanToInt("LVIII"));
    assertEquals(1994, romanNumeral.romanToInt("MCMXCIV"));
  }
}
