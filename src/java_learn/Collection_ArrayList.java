package java_learn;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Justifymeaning
 * @Date 2021/3/16 19:23
 * @Version 1.0
 */
public class Collection_ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");//添加
        list.add("world");
        list.add("us");
        list.remove(0);//删除
        list.set(0,"aaa");//修改
        String s0 = list.get(0);    // 获取指定索引位置上的数值
        System.out.println(s0);
        for (String o:list){
            System.out.println(o);
        }
    }
}
