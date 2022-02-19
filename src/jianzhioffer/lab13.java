package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/21 15:33
 * @Version 1.0
 */

/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
 * 它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 */
public class lab13 {
    public int movingCount(int m, int n, int k) {
        boolean visited[][] = new boolean[m][n];
        int nums = dfs(m, n, k, visited, 0, 0);
        return nums;
    }

    public int dfs(int m, int n, int k, boolean visited[][], int i, int j){     // m,n为总的行列数，i，j为本次搜索的行列数
        if(i >= m || j >= n || bitnum(i)+bitnum(j) > k || visited[i][j]){   //  判断条件分别为行越界，列越界，数位越界，已被访问
            return 0;
        }

        visited[i][j] = true;
        return 1 + dfs(m, n, k, visited, i+1, j)+ dfs(m, n, k, visited, i, j+1);
    }

    //  计算当前行列的数位值
    public int bitnum(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}

