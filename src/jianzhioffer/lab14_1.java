package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/22 17:48
 * @Version 1.0
 */

/**
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 */
public class lab14_1 {
//    纯数学企业级理解  详情见解析
    public int cuttingRope(int n) {
        if(n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        if(b == 0) return (int)Math.pow(3, a);
        if(b == 1) return (int)Math.pow(3, a - 1) * 4;
        return (int)Math.pow(3, a) * 2;
    }

//    贪心算法 推导得出只有长度为2或3的绳子段不用再切分，且长度为3是更优解
    public int cuttingRope2(int n) {
        if(n < 4){
            return n - 1;   //  长度小于4的绳子不用切分
        }
        int res = 1;
        while(n > 4){
            res *= 3;
            n -= 3;
        }
        return res * n;
    }

//    动态规划
    public int cuttingRope3(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for(int i = 3; i < n + 1; i++){     //  只有长度为3以上的绳子才需要裁剪
            for(int j = 2; j < i; j++){     //  每段裁剪绳子的长度必须大于1.乘积才会增加，否则无意义
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }

}
