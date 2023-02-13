// Реализовать простой калькулятор

import java.util.Scanner;

public class homework13 {

    static int Number() {
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        return number;
    }

    static String Operations() {
        Scanner iScanner = new Scanner(System.in);
        String operation = iScanner.nextLine();
        return operation;
    }

    static int getResult(String operat, int a, int b) {
        int result = 0;
        switch (operat) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
            default:
                System.out.println("Введите оператор: -, +, *, /, %");
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int a = Number();
        System.out.println("Выбирите операцию: +, -, *, /, %");
        String operation = Operations();
        System.out.println("Введите второе число: ");
        int b = Number();
        int result = getResult(operation, a, b);
        System.out.printf("%d %s %d = %d", a, operation, b, result);
    }
}