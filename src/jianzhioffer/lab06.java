package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/16 16:42
 * @Version 1.0
 */

import java.util.Stack;


//  Definition for singly-linked list.



//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
public class lab06 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        int length = stack.size();
        int[] nums = new int[length];
        for (int i=0 ; i<length; i++){
            nums[i] = stack.pop().val;
        }
        return nums;

    }

}