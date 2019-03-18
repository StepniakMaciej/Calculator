package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        char operatorType;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number");
        firstNumber = scanner.nextInt();
        System.out.println("Give the second number");
        secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();
        InputNumbers inputNumbers = new InputNumbers();
        inputNumbers.setFirstNumber(firstNumber);
        inputNumbers.setSecondNumber(secondNumber);

        ProgramDescription programDescription = new ProgramDescription();

        programDescription.showDescription();
        operatorType = scanner.next().charAt(0);
        switch (operatorType) {
            case '+': {
                System.out.println(calculator.add(inputNumbers.getFirstNumber(), inputNumbers.getSecondNumber()));
                break;
            }
            case '-': {
                System.out.println(calculator.minus(inputNumbers.getFirstNumber(), inputNumbers.getSecondNumber()));
                break;
            }
            case '*': {
                System.out.println(calculator.multiply(firstNumber, secondNumber));
                break;
            }
            case '/': {
                if (secondNumber != 0) {
                    System.out.println(calculator.divide(firstNumber, secondNumber) + "and the rest: "
                            + firstNumber % secondNumber);
                } else {
                    System.out.println("You can not divide be 0");
                }

                break;

            }

        }
    }
}

