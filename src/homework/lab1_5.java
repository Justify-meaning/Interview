package homework;

import java.util.Scanner;

//  输入一个整数n后，输出一个图形 例如n=3
//  *
// ***
//*****
public class lab1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){    //  外层循环控制图形的行数
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");    // 控制该层空格的数量 这里注意printin输出会自动换行 无法得到正确结果
            }
            for (int k = 1; k < 2*i; k++){  // 控制该层*的数量
                System.out.print("*");
            }
            System.out.print("\n");   //  打印输出换行
        }
    }
}
