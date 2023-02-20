// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class homework33 {
    public static List<Integer> getRandomList(int size) {
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100));
        }
        System.out.println(randomList.toString());
        return randomList;
    }

    public static void getRezult(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        int count = list.size();
        int sum = 0;        
        for (Integer i : list) {
            sum += i;
        }
        double result = sum / count;
        System.out.printf("Минимальное: %d\nМаксимальное: %d\nСреднее арифметичское: %.2f", min, max, result);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите размер списка: ");
        int size = iScanner.nextInt();
        getRezult(getRandomList(size));
    }
}