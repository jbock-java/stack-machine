package io.github.stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class Pushdown {

    private final Queue<Stack> stack = new ArrayDeque<>();
    private State state = State.P;

    public Pushdown() {
        stack.offer(Stack.Z);
    }

    void transition(State q, Input s, Stack g) {

    }
}
