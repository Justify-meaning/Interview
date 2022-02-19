package jianzhioffer;

import java.util.Stack;

/**
 * @Author Justifymeaning
 * @Date 2021/3/16 21:22
 * @Version 1.0
 */
// 用两个栈实现一个队列
public class lab09 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
//    构建两个栈 使其成为一个队列
    public lab09() {
          stack1 = new Stack<>();// 控制进栈
          stack2 = new Stack<>();// 控制出栈

    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){   // 先检测stack2是否为空，如果有数据直接输出
            while (!stack1.isEmpty()){  //stack2为空时，把stack1的数据由栈顶到栈尾逐个移到stack2，这样stack2输出时可以实现队列的先进先出原则
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty() ){    // 输出stack2的栈顶元素
            int a = stack2.pop();
            return a;
        }else{  // 没有元素则返回-1
            return -1;
        }

    }
}
