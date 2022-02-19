package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/26 15:52
 * @Version 1.0
 */

public class lab27 {
//    二叉树的镜像
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode mirrorTree(TreeNode root) {
//        递归
        if (root == null){
            return null;
        }
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;

    }
}
