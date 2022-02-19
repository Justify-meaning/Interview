package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/22 17:14
 * @Version 1.0
 */

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 */
public class lab17 {
    public int[] printNumbers(int n) {
        int end = (int)Math.pow(10, n) - 1;
        int[] res = new int[end];
        for(int i = 0; i < end; i++)
            res[i] = i + 1;
        return res;
    }
}
//  考虑大数的情况
class Solution {
    char[] num;
    int[] ans;
    int count = 0,n;
    public int[] printNumbers(int n) {
        this.n = n;
        num = new char[n];
        ans = new int[(int) (Math.pow(10, n) - 1)];
        dfs(0);
        return ans;
    }
    private void dfs(int n) {
        if (n == this.n) {
            String tmp = String.valueOf(num);
            int curNum = Integer.parseInt(tmp);
            if (curNum!=0) ans[count++] = curNum;
            return;
        }
        for (char i = '0'; i <= '9'; i++) {
            num[n] = i;
            dfs(n + 1);
        }
    }
}
