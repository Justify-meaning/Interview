package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/26 15:57
 * @Version 1.0
 */

/**28.对称的二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。
 * 如果一棵二叉树和它的镜像一样，那么它是对称的。
 */
public class lab28 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return recur(root.left, root.right);

    }
    boolean recur(TreeNode L, TreeNode R){
        if (L == null && R == null)
            return true;
        if (L == null || R == null || L.val != R.val){
            return false;
        }
        return recur(L.left, R.right) && recur(L.right, R.left);
    }
}
