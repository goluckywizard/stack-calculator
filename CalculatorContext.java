package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class CalculatorContext {
    Deque<Double> stack;
    Map<String, Double> defVar;
    public CalculatorContext() {
        stack = new ArrayDeque<>();
        defVar = new HashMap<>();
    }
    Deque<Double> getStack() {
        return stack;
    }
    Map<String, Double> getMap() {
        return defVar;
    }
}
