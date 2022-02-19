package mianshi;

import java.util.Scanner;

/**
 * @Author Justifymeaning
 * @Date 2021/3/25 13:54
 * @Version 1.0
 */
/**
 * 样例输入
 * 4
 * 1111
 * 0101
 * 1101
 * 0010
 */

public class baidu_02in_output {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String nn=scanner.nextLine();
        int n = Integer.parseInt(nn);
        int [][]arr=new int[n][n];
        for (int i=0;i<n;i++)
        {
            String s=scanner.nextLine();
            char []chars=s.toCharArray();
            for (int j=0;j<n;j++)
            {
                arr[i][j] = Integer.parseInt(String.valueOf(chars[j]));
            }

        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
