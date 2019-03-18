package com.company;

public class Calculator {
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int minus(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public int divide(int a, int b) {
        int result1 = (a / b);
        int result2 = (a % b);
        return result1 + result2;
    }

}
