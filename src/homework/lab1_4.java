package homework;

import java.util.Scanner;

//  判断一个整数是否为质数
public class lab1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = scanner.nextInt();
        int i;
        boolean bool = true;       //   通过boolean标记进行判断
        for(i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println("该数不是质数！");
                bool = false;
                break;
            }
            else{
                continue;
            }
        }
        if(bool == true){
            System.out.println("该数是质数！");
        }

    }
}
