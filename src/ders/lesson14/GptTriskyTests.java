package ders.lesson14;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class GptTriskyTests {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(20);
        q.add(5);
        q.add(15);
        System.out.println("Poll from PriorityQueue: " +q.poll());
        System.out.println();
        ArrayDeque<String> dq=new ArrayDeque<>();
        dq.add("X");
        dq.add("Y");
        dq.add("Z");
        System.out.println("pollFirst "+dq.pollFirst());
        System.out.println("pollFirst "+dq.pollLast());
        System.out.println();
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("peek stack "+stack.peek());
        System.out.println("pop stack "+stack.pop());

    }
}
