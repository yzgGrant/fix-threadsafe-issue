package com.github.hcsp.multithread;

public class Counter {
    private final Object lock = new Object();
    private int value = 0;

    public int getValue() {
        return value;
    }

    // 加上一个整数i，并返回加之后的结果
    public int addAndGet(int i) {
        synchronized (lock) {
            value += i;
        }
        return value;
    }

    // 减去一个整数i，并返回减之后的结果
    public int minusAndGet(int i) {
        synchronized (lock) {
            value -= i;
        }
        return value;
    }
}
