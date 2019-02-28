package me.ronggenliu.easy;
/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (32.98%)
 * Total Accepted:    409.1K
 * Total Submissions: 1.2M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 *
 *
 * Example 2:
 *
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 *
 */
class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    char c;
    int i = 0;
    if (strs.length == 0) {
      return "";
    }
    for (; i < strs[0].length(); i++) {
      for (String str : strs) {
        try {
          c = str.charAt(i);
        } catch (StringIndexOutOfBoundsException e) {
          return strs[0].substring(0, i);
        }
        if (c != strs[0].charAt(i)) {
          return strs[0].substring(0, i);
        }
      }
    }
    return strs[0].substring(0, i);
  }
}
