package me.ronggenliu.easy;

/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 *
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (41.82%)
 * Total Accepted:    507.5K
 * Total Submissions: 1.2M
 * Testcase Example:  '121'
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 * 
 * Example 1:
 * 
 * 
 * Input: 121
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a
 * palindrome.
 * 
 * 
 * Follow up:
 * 
 * Coud you solve it without converting the integer to a string?
 * 
 */

class PalindromeNumber {
  public boolean isPalindrome(int x) {
    return (x < 0 || (x % 10 == 0 && x != 0)) ? false : halfReverseInteger(x);
  }

  private boolean halfReverseInteger(int x) {
    int ret = 0;
    // only need to reverse half of the interger.
    while (x > ret) {
      int tail = x % 10;
      x /= 10;
      ret = ret * 10 + tail;
    }
    return x == ret || x == ret / 10;
  }
}