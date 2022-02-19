package homework;

import java.util.Scanner;

//  输入一个数，得到该数的阶乘 例如5 = 5*4*3*2*1
//  以下为通过对象调用的方法实现
public class lab1_3 {
    public int Jiecheng(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * Jiecheng(a - 1);
        }
    }

    public static void main(String[] args) {
        lab1_3 a = new lab1_3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = scanner.nextInt();
        int s = a.Jiecheng(num);
        System.out.println(s);
    }
}


