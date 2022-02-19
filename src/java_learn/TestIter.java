package java_learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Justifymeaning
 * @Date 2021/3/16 20:05
 * @Version 1.0
 */
public class TestIter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add("list"+i);
        }
        //获取迭代器
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("-------for------");
        for (Iterator<String> iter2 = list.iterator();iter2.hasNext();){
            System.out.println(iter2.next());
        }
    }
}
