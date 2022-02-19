package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/18 19:12
 * @Version 1.0
 */

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */
public class lab10_2 {
    public int numWays(int n) {
        int a = 1;
        int b = 1;
        // 思想就是动态规划 反向思考：跳最后一次台阶时 要么跳一下 要么跳两下 因此最后一次的跳法f(n+1) = f(n) + f(n-1) {即最后一次跳一下和跳两下的方式之和}
        int temp = 0;   //暂存变量 用于更新
        for (int i = 0; i < n; i++){    //比如要求f(3) 已知a是f(0),f(0)-f(1)-f(2)-f(3)共要求变换三次 因此for循环内需要改变变量三次，执行三次动态规划
            temp = (a + b) % 1000000007;
            a = b;
            b = temp;
        }
        return  a;
    }

}
