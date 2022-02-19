package java_learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Justifymeaning
 * @Date 2021/3/16 19:29
 * @Version 1.0
 */
public class SortTests {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(120);
        list1.add(200);
        list1.add(12);
        list1.add(888);
        System.out.println(list1);
        Collections.sort(list1);//排序
        System.out.println(list1);
        int max = Collections.max(list1);
        int min = Collections.min(list1);
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);

        List<String> list2 = new ArrayList<>();
        list2.add("abc");
        list2.add("dc");
        list2.add("bade");
        System.out.println(list2);
        Collections.sort(list2);//根据ASCII排序
        System.out.println(list2);
    }
}
