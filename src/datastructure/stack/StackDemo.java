package datastructure.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        stack.add(-2);
        stack.push(5);
        stack.add(4);
        stack.push(3);
//        stack.push(2);
//        stack.push(1);
//        stack.push(0);
        System.out.println("Before : "+stack);
        stack.pop();
        System.out.println("After : "+stack);
    }
}
