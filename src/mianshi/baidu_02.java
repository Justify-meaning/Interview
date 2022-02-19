package mianshi;

/**
 * @Author Justifymeaning
 * @Date 2021/3/17 20:26
 * @Version 1.0
 */

/**
 * 小明最近学会了一种棋，这种棋的玩法和围棋有点类似，最后通过比较黑子和白子所占区域的大小来决定胜负。
 * 在下棋过程中，如果白子或者黑子将对方全部围住，则所围区域中的棋子将更换颜色。
 * 如果用1表示黑子，0表示白子，给出如下实例：
 * 1111
 * 0101
 * 1101
 * 0010
 * 因为第2行第3列的白子（0）和第3行第3列的白子（0）完全被黑子（1）围住，因此需要这两个0将变为1。
 * 结果变为：
 * 1111
 * 0111
 * 1111
 * 0010
 * 为了简化问题的求解，只需要大家找出所有被黑子围住的白子，并将这些白子变为黑子后输出。
 */

/**
 * 单组输入。
 * 第1行为一个正整数n（n<=1000），表示棋盘的大小。
 * 接下来n行输入一个n*n的0/1矩阵，其中0表示白子，1表示黑子。
 */

/**
 * 样例输入
 * 4
 * 1111
 * 0101
 * 1101
 * 0010
 */

import java.util.Scanner;

/**
 * 样例输出
 * 1111
 * 0111
 * 1111
 * 0010
 */
public class baidu_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[][] a = new int[len][len];
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        for(int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
//                先判断四个边角
                if (i == 0 && j == 0){
                    if(a[i+1][j] == 1 && a[i][j+1] == 1){
                        a[i][j] = 1;
                    }
                }
                if (i == 0 && j == len-1){
                    if(a[i][j-1] == 1 && a[i+1][j] == 1){
                        a[i][j] = 1;
                    }
                }
                if (i == len-1 && j == 0){
                    if(a[i-1][j] == 1 && a[i][j+1] == 1){
                        a[i][j] = 1;
                    }
                }
                if (i == len-1 && j == len-1) {
                    if (a[i-1][j] == 1 && a[i][j-1] == 1) {
                        a[i][j] = 1;
                    }
                }
//                判断最上面那一行
                if(i == 0){
                    if(a[i][j-1] == 1 && a[i][j+1] == 1 && a[i+1][j] == 1){
                        a[i][j] = 1;
                    }
                }
//                判断最下面那一行
                if(i == 3){
                    if(a[i][j-1] == 1 && a[i][j+1] == 1 && a[i-1][j] == 1){
                        a[i][j] = 1;
                    }
                }
//                判断最左边的一列
                if(j == 0){
                    if(a[i-1][j] == 1 && a[i+1][j] == 1 && a[i][j+1] == 1){
                        a[i][j] = 1;
                    }
                }
//                判断最右边的一列
                if(j == 3){
                    if(a[i-1][j] == 1 && a[i+1][j] == 1 && a[i][j-1] == 1){
                        a[i][j] = 1;
                    }
                }
//                判断其他非特殊位置
                else {
                    if(a[i-1][j] == 1 && a[i+1][j] == 1 && a[i][j-1] == 1 && a[i][j+1] == 1){
                        a[i][j] = 1;
                    }
                }
            }
        }

//        输出结果数组
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
