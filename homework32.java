// Дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class homework32 {

    public static List<Integer> getRandomList() {
        Random random = new Random();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите размер списка: ");
        int n = iScanner.nextInt();
        int size = n;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list.toString());
        return list;
    }

    public static List<Integer> deletEvenNum(List<Integer> list) {
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());
        return list;
    }

    public static void main(String[] args) {
        deletEvenNum(getRandomList());
    }
}