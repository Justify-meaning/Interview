package homework;
/*小明每天会得到2.5元，每过5天或5的倍数的天数时，会花去6元
*多少天后小明能够存够100元
* */
public class lab1_6 {
    public static void main(String[] args) {
        double sum = 0;     // 这里需要注意如果使用int类型，小数会被省略，无法得到正确结果，应使用double类型
        int day = 0;
        while(sum < 100){
            day++;
                if(day % 5 == 0 ){
                    sum -= 3.5;     //  即使那天花钱，但小明依然能得到2.5元
                }
                else {
                    sum += 2.5;
                }
        }
        System.out.println("经过"+day+"天小明存够了100元");
    }


}
