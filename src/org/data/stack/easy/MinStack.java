package org.data.stack.easy;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    private int size;
    private List<Integer> valueList;
    private List<Integer> minValueList;
    private int minValue;

    /** initialize your data structure here. */
    public MinStack() {
        size = 0;
        valueList = new ArrayList<>();
        minValueList = new ArrayList<>();
        minValue = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if(x<=minValue){
            minValue = x;
        }
        valueList.add(size, x);
        minValueList.add(size, minValue);
        size++;
    }

    public void pop() {
        size--;
    }

    public int top() {
        return valueList.get(size-1);
    }

    public int getMin() {
        return minValueList.get(size-1);
    }
}
