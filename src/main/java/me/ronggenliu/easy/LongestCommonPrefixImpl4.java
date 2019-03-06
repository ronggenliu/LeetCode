package me.ronggenliu.easy;

/**
 * Binary Search solution for LCP.
 */
public class LongestCommonPrefixImpl4 implements LongestCommonPrefix {
  @Override
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    int min = Integer.MAX_VALUE;
    for (String str : strs) {
      min = Math.min(min, str.length());
    }
    return binarySearch(strs, 1, min);
  }

  private String binarySearch(String[] strs, int l, int r) {
    int mid;
    while (l <= r) {
      mid = (l + r) / 2;
      if (isCommonPrefix(strs, mid)) {
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
    return strs[0].substring(0, (l + r) / 2);
  }

  private boolean isCommonPrefix(String[] strs, int mid) {
    String tmp = strs[0].substring(0, mid);
    for (int i = 1; i < strs.length; i++) {
      if (!strs[i].startsWith(tmp)) {
        return false;
      }
    }
    return true;
  }
}
