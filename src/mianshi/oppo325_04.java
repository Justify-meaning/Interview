package mianshi;

/**
 * @Author Justifymeaning
 * @Date 2021/3/25 15:48
 * @Version 1.0
 */
//  给一个十进制的数 返回其九进制的表示
public class oppo325_04 {
    public String convertToBase9 (int num) {
        // write code here
        String a = new String();
        int i = 0;  // 记录存入字符串的是第几位
        while (num != 0){
            int temp = num;
            while(temp / 9 != 0){
                temp = temp / 9;
                a = (String)(temp % 9);
            }
            num = num / 9;
        }
        return a;

    }

//    public static void main(String[] args) {
//        int a = 1;
//        char b = (char)a;
//        System.out.println(b);
//    }
}
