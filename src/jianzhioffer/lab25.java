package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/24 19:55
 * @Version 1.0
 */

/**简单题：合并两个排序的列表
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 */
public class lab25 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0);
        ListNode curr = dum;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){   //  注意审题 不要看错条件
                curr.next = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 != null? l1 : l2;
        return dum.next;
    }

}
