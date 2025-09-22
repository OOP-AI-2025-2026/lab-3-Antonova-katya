package org.example.task2;

public class IntStack {

    private int[] data;
    private int size;

    public IntStack() {
        data = new int[10];
        size = 0;
    }

    private void resizeArray() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void push(int value) {
        if (size >= data.length) {
            resizeArray();
        }
            data[size] = value;
            size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        size--;
        return data[size];
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        }
        return data[size - 1];
    }

    public void clear() {
        size = 0;
    }
}

