/**
 * @Author Justifymeaning
 * @Date 2021/3/26 14:36
 * @Version 1.0
 */
public class qijinzhi_504 {
//    十进制数转换为七进制，返回字符串形式，要熟悉使用Stringbuilder，里面的相关函数有助于操作字符串
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        //判断零
        if(num == 0 ){
            sb.append("0");
            return sb.toString();
        }
        boolean flag = false;
        //判断是否小于零，将小于零的数，转换成大于零的数，统一处理
        if(num<0){
            num = - num;
            flag = true;
        }
        // 求进制的模板，转换成几进制，就先求余几，然后再除以几
        while(num!=0){
            sb.append(num%7);
            num/=7;
        }
        // 逆序
        sb.reverse();
        if(flag) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }
}
