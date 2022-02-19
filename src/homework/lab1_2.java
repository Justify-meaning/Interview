package homework;

//  计算1——100的整数之和 奇数时减法 偶数时加法(1+2-3+4...+100)
public class lab1_2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=2; i<=100; i++){
            if(i % 2 == 0){
                sum += i;
            }
            else {
                sum -= i;
            }
        }
        System.out.println("1——100的整数运算之和为：" + (sum+1));
    }
}
