package java_learn;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Justifymeaning
 * @Date 2021/3/16 20:26
 * @Version 1.0
 */
public class Test_HashMap {
    public static void main(String[] args) {
        Map<Double,String> map = new HashMap();
        map.put(1d,"aaa");//添加
        map.put(2d,"bbb");
        map.put(3d,"ccc");
        for (Object f:map.entrySet()){
            System.out.println(f);
        }
        System.out.println("----------Map----------");
        Map<Double,String> map1 = new HashMap<>();
        map.put(1d,"aaa");//添加
        map.put(2d,"bbb");
        map.put(3d,"ccc");
        Object o = map.get(2d);//查询
        System.out.println(o);
        map.replace(2d,"world");//修改
        map.remove(1d);//删除
        for (Object f:map.entrySet()){
            System.out.println(f);
        }
    }
}
