package me.ronggenliu.easy;

/**
 * Binary Search solution for LCP.
 */
public class LongestCommonPrefixImpl4 implements LongestCommonPrefix {
  @Override
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    int mid = strs[0].length() / 2;
    return binarySearch(strs, mid);
  }

  private String binarySearch(String[] strs, int mid) {
    String left = strs[0].substring(0, mid);
    if (mid == strs[0].length()) {
      return left;
    }
    String right = strs[0].substring(mid);
    for (int i = 0; i < strs.length; i++) {
      if (!strs[0].startsWith(left)) {
        return left;
      }
    }
    return binarySearch(strs, mid + right.length() / 2);
  }
}
