package mianshi;

/**
 * @Author Justifymeaning
 * @Date 2021/3/25 13:11
 * @Version 1.0
 */

/**
 * leetcode打家劫舍1
 * 题意：给定一个数组，相邻的数字不能相加，其余数字可以任意相加，问在次情况下最大和是多少
 * 思路：理解题意后就能明白这道题的和最大和是个动态增长的过程而且依赖之前求出来的最大和，我们可以用dp来解决。
 * dp的动态方程为dp[i] = max(dp[i-2]+nums[i],dp[i-1]）
 */
public class oppo_01 {
    //  优化后不用储存进数组
    public int rob(int[] num) {
        int prevMax = 0;
        int currMax = 0;
        for (int x : num) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }
}

