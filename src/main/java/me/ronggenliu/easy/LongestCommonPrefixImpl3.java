package me.ronggenliu.easy;

/**
 * Created by Gary Liu on 2019/3/5.
 *
 * Divide and Conquer LCP(S1...Sn) = LCP(LCP(S1...Sk), LCP(Sk+1...Sn))
 */
public class LongestCommonPrefixImpl3 implements LongestCommonPrefix {
  @Override
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }
    return longestCommonPrefix(strs, 0, strs.length - 1);
  }

  private String longestCommonPrefix(String[] strs, int l, int r) {
    if (l == r) {
      return strs[l];
    } else {
      int mid = (l + r) / 2;
      String lcpLeft = longestCommonPrefix(strs, l, mid);
      String lcpRight = longestCommonPrefix(strs, mid + 1, r);
      return commonPrefix(lcpLeft, lcpRight);
    }
  }

  private String commonPrefix(String lcpLeft, String lcpRight) {
    int min = Math.min(lcpLeft.length(), lcpRight.length());
    for (int i = 0; i < min; i++) {
      if (lcpLeft.charAt(i) != lcpRight.charAt(i)) {
        return lcpLeft.substring(0, i);
      }
    }
    return lcpLeft.substring(0, min);
  }
}
