package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/29 13:55
 * @Version 1.0
 */

import java.util.Stack;

/**中等：栈的压入弹出序列
 *输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，
 * 序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 */
//public class lab31 {
//    public boolean validateStackSequences(int[] pushed, int[] popped) {
//        Stack<Integer> stack = new Stack<Integer>();
//        int i = 0;
//        for (int num:pushed){
//            stack.push(num);
//            while (!stack.isEmpty() && stack.peek() == popped[i]){
//                stack.pop();
//                i++;
//            }
//        }
//        return stack.isEmpty();
//}
