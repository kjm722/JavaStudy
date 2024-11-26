package org.example;

public class SimpleCalculator {
        public int multiply(int num1, int num2) {
            return num1 * num2;
        }

    public int minus(int num1, int num2){
        return num1-num2;
    }

    public int divide(int num1, int num2){
        return num1/num2;
    }

    public int reminder(int num1, int num2){
        return num1%num2;
    }

    public int run(int num1, int num2, int num3) {
            return ((num1 + num2) * num2 + -num3) * num3 / num2;
    }
}
