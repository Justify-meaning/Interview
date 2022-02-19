package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/27 15:42
 * @Version 1.0
 */
//  简单题：顺时针打印矩阵
//  输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
public class lab29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0];
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1;  //  定义左右上下四个边界
        int x = 0;  //  定义数组起始值
        int res[] = new int[(r+1) * (b+1)];    //定义返回数组
        while (true){
            for (int i = l; i <= r; i++) {    //  从左到右
                res[x++] = matrix[t][i];
            }
            if (++t > b)
                break;
            for (int i = t; i <= b; i++){   //  从上到下
                res[x++] = matrix[i][r];
            }
            if (l > --r)
                break;
            for (int i = r; i >= l; i--){    //  从右到左
                res[x++] = matrix[b][i];
            }
            if (t > --b)
                break;
            for (int i = b; i >= t; i--){   //  从下往上
                res[x++] = matrix[i][l];
            }
            if (++l > r)
                break;
        }
        return res;

    }

}
