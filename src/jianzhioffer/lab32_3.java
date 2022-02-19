package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/29 15:06
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**中等：从上至下打印二叉树③
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 */
public class lab32_3 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null)   queue.add(root);
        while (!queue.isEmpty()){
            LinkedList<Integer> tmp = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--){ //  循环输出
                TreeNode node = queue.poll();   //将队列的第一个节点弹出并保留
                if(res.size() % 2 == 0) tmp.addLast(node.val);  //  偶数层从左到右输出，因此链表在尾部插入元素
                else tmp.addFirst(node.val); //  奇数层从右到左输出，因此在链表头部插入元素
                if (node.left  != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(tmp);   //将其中一行节点值保留到结果列表中
        }
        return res;
    }
}
