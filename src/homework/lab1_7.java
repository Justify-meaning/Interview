package homework;
//求出1000以内所有的完数 完数：一个数的因子之和等于它本身 例如 6 = 1+2+3
public class lab1_7 {
    public static void main(String[] args) {
//        1不算完数
        for (int i = 2; i < 1000; i++){
            // 外层循环 遍历1000以为的整数
            int sum = 0;
            for(int j = 1; j <= i/2; j++){  //不要忘记是<=
                if (i % j == 0){
                    //  此时j就是因子
                    sum += j;
                }
            }
            if (i == sum){
                System.out.println(i+"是完数");
            }
        }
    }
}
