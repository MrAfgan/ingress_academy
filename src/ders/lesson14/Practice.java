package ders.lesson14;

import java.util.ArrayDeque;

public class Practice {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println();
        ArrayDeque<String> stack1=new ArrayDeque<>();
        stack1.push("A");
        stack1.push("B");
        stack1.push("C");
        System.out.println(stack1.pop());
        System.out.println();
        ArrayDeque<String> dq=new ArrayDeque<>();
        dq.add("A");
        dq.add("B");
        dq.add("C");
        System.out.println(dq.pollLast());
        System.out.println(dq.pollFirst());

    }
}
