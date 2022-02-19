package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/17 14:28
 * @Version 1.0
 */
// 斐波那契数列

/**
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 */
public class lab10 {
    public int fib(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int fn0 = 0;
        int fn1 = 1;
        int temp = 0;
        //  避免开数组浪费空间
        for(int i = 0; i <= n - 2; i++){
            temp = fn0 + fn1;   //temp变量只是暂存两项相加运算的结果
            fn0 = fn1;
            fn1 = temp % 1000000007;    //  避免越界
        }
        return fn1;
    }
    // 进一步优化的代码 动态规划 改变ab的值 这样减少了递归中重复的计算
    public int fib2(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

}
