package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/4/10 21:04
 * @Version 1.0
 */

/**中等：二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。
 * 如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 */
public class lab33 {
    public boolean verifyPostorder(int[] postorder){
        return recur(postorder, 0, postorder.length - 1);
    }

    boolean recur(int[] postorder, int i, int j){
        if (i >= j)
            return true;
        int p = i;  //  记录左子树的初始节点
        while (postorder[p] < postorder[j]) p++;    //直到找到左子树最末尾的节点
        int m = p;  // 作为右子树的初始节点
        while (postorder[p] > postorder[j]) p++;    //直到找到you子树最末尾的节点
        return p == j && recur(postorder, i, m-1) && recur(postorder, m, j-1);
    }
}
