package java_learn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class riqi {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String str = sdf.format(date);
        System.out.println(str);
//     结果：显示当前日期和时间
    }
}
