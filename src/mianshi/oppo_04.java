package mianshi;

import java.util.Scanner;

/**
 * @Author Justifymeaning
 * @Date 2021/3/25 13:12
 * @Version 1.0
 */
public class oppo_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = min(a, b);
        int n = a * b / m;
        System.out.print(n);
    }
    public static int min(int a, int b){
        if(a < b){
            int t = a;
            a = b;
            b = t;
        }
        while(b != 0){
            if(a == b){
                return a;
            }else{
                int k = a % b;
                a = b;
                b = k;
            }
        }
        return a;
    }
}
