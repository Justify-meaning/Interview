package mianshi;

/**
 * @Author Justifymeaning
 * @Date 2021/3/25 13:12
 * @Version 1.0
 */

import java.util.*;
//合并几个无序链表为一个有序链表
//链表
class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
}

//自定义比较器
class Comparators {

    //单例模式(手动尴尬)
    private static Comparator comparator = null;

    public static Comparator getComparator() {
        if(comparator == null) {
            comparator = new Comparator() {
                public int compare(Object ob1, Object ob2) {
                    if(ob1 instanceof Node) return compare((Node)ob1, (Node)ob2);
                    return 1;
                }

                //自定义链表排序规则
                public int compare(Node n1, Node n2) {
                    return n1.val - n2.val;
                }
            };
        }
        return comparator;
    }
}

public class oppo_02 {

    //将无序单链表转化为有序单链表
    public static Node sortOfList(Node p) {
        //暂存链表结点
        ArrayList<Node> arr = new ArrayList<Node>();
        Node temp = p;
        while(temp != null) {
            arr.add(temp);
            temp = temp.next;
        }
        Collections.sort(arr, Comparators.getComparator());

        Node ans = arr.get(0);
        Node temp2 = ans;
        for(int i = 1; i < arr.size(); i++) {
            temp2.next = arr.get(i);
            temp2 = temp2.next;
        }
        temp2 = null;

        return ans;
    }

    //两个无序单链表p1,p2合并成一个有序单链表
    public static Node mergeList(Node p1, Node p2) {

        //得到有序单链表
        Node p11 = sortOfList(p1);
        Node p22 = sortOfList(p2);


        //合并单链表
        Node ans;
        Node temp1 = p11;
        Node temp2 = p22;
        if(temp1.val <= temp2.val) {
            ans = temp1;
            temp1 = temp1.next;
        } else {
            ans = temp2;
            temp2 = temp2.next;
        }
        Node temp = ans;
        while(temp1 != null && temp2 != null) {
            if(temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        while(temp1 != null) {
            temp.next = temp1;
            temp = temp.next;
            temp1 = temp1.next;
        }
        while(temp2 != null) {
            temp.next = temp2;
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp = null;
        return ans;
    }

    //测试
    public static void main(String[] args) {
        Node p1 = new Node(3);
        p1.next = new Node(5);
        p1.next.next = new Node(4);
        p1.next.next.next = new Node(6);
        p1.next.next.next.next = new Node(7);

        Node p2 = new Node(8);
        p2.next = new Node(9);
        p2.next.next = new Node(10);
        p2.next.next.next = new Node(2);
        p2.next.next.next.next = new Node(1);
        p2.next.next.next.next.next = new Node(11);

        Node ans = mergeList(p1, p2);
        Node temp = ans;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

