package jianzhioffer;
/**
 * @Author Justifymeaning
 * @Date 2021/3/23 15:27
 * @Version 1.0
 */

//给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
//返回删除后的链表的头节点。


//Definition for singly-linked list.

public class lab18 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteNode(ListNode head, int val) {
        while (head == null || (head.val == val && head.next == null))
            return null;
        ListNode cur = head;        // 单指针
        while(cur.next != null){
            if (cur.val == val)
                return head.next;
            if (cur.next.val == val && cur.next.next != null){
                cur.next = cur.next.next;       // 下一节点值对应，且有下下节点
            }
            if (cur.next.val == val && cur.next.next == null) {
                cur.next = null;        // 下一节点值对应，无下下节点
                return head;    //  不加这一句会导致缺乏指针，报错
            }
            cur = cur.next;
        }
        return head;
    }

//    双指针 永远滴神
    public ListNode deleteNode2(ListNode head, int val) {
        if(head.val == val) return head.next;
        ListNode pre = head, cur = head.next;
        while(cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if(cur != null) pre.next = cur.next;
        return head;
    }
//  单指针优化版
    public ListNode deleteNode3(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        ListNode cur = head;
        while (cur.next != null && cur.next.val != val)
            cur = cur.next;
        if (cur.next != null)
            cur.next = cur.next.next;
        return head;
    }
}
