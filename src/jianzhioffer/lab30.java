package jianzhioffer;

import java.util.Stack;

/**
 * @Author Justifymeaning
 * @Date 2021/3/27 16:38
 * @Version 1.0
 */
public class lab30 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed){
            stack.push(num);    // num入栈
            while (!stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
