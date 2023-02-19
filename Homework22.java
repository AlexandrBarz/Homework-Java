// Реализовать простой калькулятор и добавить логирование

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;
import java.util.logging.Logger;

public class Homework22 {

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

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Homework22.class.getName());
        FileHandler fHandler = new FileHandler("logHM22.txt", true);
        logger.addHandler(fHandler);
        SimpleFormatter sFormat = new SimpleFormatter();
        fHandler.setFormatter(sFormat);
        System.out.println("Введите первое число: ");
        int a = Number();
        logger.info("Введено первое число --> " + a);
        System.out.println();
        System.out.println("Выбирите операцию: +, -, *, /, %");
        String operation = Operations();
        logger.info("Выбрана операция --> " + operation);
        System.out.println();
        System.out.println("Введите второе число: ");
        int b = Number();
        logger.info("Введено второе число --> " + b);
        System.out.println();
        int result = getResult(operation, a, b);
        System.out.printf("%d %s %d = %d", a, operation, b, result);
        System.out.println();
        logger.info("Произведено вычисление --> " + result);
    }
}