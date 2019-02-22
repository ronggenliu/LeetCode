package me.ronggenliu.easy;
/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.08%)
 * Total Accepted:    600.2K
 * Total Submissions: 2.4M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of
 * this problem, assume that your function returns 0 when the reversed integer
 * overflows.
 * 
 */
class ReverseInteger {
    
    public int reverse(int x) {
        // if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
        //     return 0;
        // }
        // char[] chars = (x + "").toCharArray();
        // int len = chars.length;
        // int start = 0;
        // if (x < 0) {
        //     start = 1;
        // }
        // for (int i = start; i < start + len/2; i++) {
        //     char startChar = chars[i];
        //     char end = chars[len-1+start-i];
        //     chars[i] = end;
        //     chars[len-1+start-i] = startChar;
        // }
        // int ret = 0;
        // try {
        //     ret = Integer.parseInt(new String(chars));
        // } catch (NumberFormatException e) {
        //     e.printStackTrace();
        // }
        // return ret;

        int ret = 0;
        while (x != 0) {
            int tail = x % 10;
            x /= 10;
            if ((ret > Integer.MAX_VALUE / 10) || (ret == Integer.MAX_VALUE / 10 && tail > 7)) {
                return 0;
            }
            if ((ret < Integer.MIN_VALUE / 10) || (ret == Integer.MIN_VALUE / 10 && tail < -8)) {
                return 0;
            }
            ret = ret * 10 + tail;
        }
        return ret;
    }
}
