package mianshi;

/**
 * @Author Justifymeaning
 * @Date 2021/3/17 18:55
 * @Version 1.0
 */

import java.util.Scanner;


/**
 * 小度新买了一个机器人玩具。我们可以把这个机器人放到一个二维坐标上，它的初始位置为（x0,y0）。
 * 然后给出一串指令，指令包含四个字符U、D、L和R，分别表示上、下、左、右。每遇到一个指令字符，机器人将朝相应的方向移动一格。请输出机器人的最后位置。
 */
//public class baidu_01 {
//    private int x0;
//    private int y0;
//    public baidu_01(int i, int j){
//        this.x0 = i;
//        this.y0 = j;
//    }
//
//    public void up(baidu_01 baidu01){
//        baidu01.y0++;
//    }
//
//    public void down(baidu_01 baidu01){
//        baidu01.y0--;
//    }
//
//    public void left(baidu_01 baidu01){
//        baidu01.x0--;
//    }
//
//    public void right(baidu_01 baidu01){
//        baidu01.x0++;
//    }
//
//    public void get(baidu_01 baidu01){
//        System.out.print(baidu01.x0);
//        System.out.print(baidu01.y0);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        scanner.close();
//        baidu_01 baidu01 = new baidu_01(x,y);
//        Scanner scanner1 = new Scanner(System.in);
//        String a = scanner1.next();
//        len = a.length();
//        for (int i = 0; i < len; i++){
//            if (a[i] == 'L'){
//                baidu01.left();
//            }
//            if (a[i] == 'R'){
//                baidu01.right();
//            }
//            if (a[i] == 'U'){
//                baidu01.up();
//            }
//            if (a[i] == 'D'){
//                baidu01.down();
//            }
//        }
//        scanner1.close();
//        baidu01.get();
//
//    }
//}
