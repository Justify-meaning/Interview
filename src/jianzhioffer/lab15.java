package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/22 14:44
 * @Version 1.0
 */
public class lab15 {
    /**
     *请实现一个函数，输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。
     * 例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
     */
    public int hammingWeight(int n) {
        int res = 0;
        while (n!=0){
            res += n&1;     //  n中最右一位与1进行与运算，如果是0，与运算结果不变；如果最右一位是1，与运算结果加1，这样可以统计1的位数
            n>>>=1;     //  将n右移一位 因为将n视为无符号整数，所以右移高位补0，不影响while的条件
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 000000111111111;//是八进制形式的数值
//      不可用数字转换为字符串，然后遍历字符数组的方法统计1的数量，因为传入的数据是八进制整数，不是二进制，只能通过位运算统计1的个数
        lab15  lab_15 = new lab15();
        int res = lab_15.hammingWeight(a);
        System.out.println(res);
    }
}



