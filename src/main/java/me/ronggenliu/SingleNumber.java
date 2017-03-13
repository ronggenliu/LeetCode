package me.ronggenliu;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Created by liuronggen on 13/03/2017.
 */
public class SingleNumber {
    /*
    XOR will return 1 only on two different bits. So if two numbers are the same, XOR will return 0. Finally only one number left.
    A ^ A = 0 and A ^ B ^ A = B.
     */
    public static int solution(int a[], int n) {
        int result = a[0];
        for (int i = 1; i < n; i++) {
            result = result ^ a[i];
        }
        return result;
    }
}
