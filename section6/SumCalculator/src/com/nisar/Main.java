package com.nisar;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(6.25);
        calculator.setSecondNumber(5.0);
        System.out.println("add =" + calculator.getAdditionResult());
        System.out.println("subtract = "+ calculator.getSubtractionResult());
        calculator.setFirstNumber(12.0);
        calculator.setSecondNumber(5.00);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());

    }
}