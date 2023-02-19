// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Homework21{

    public static int[] randomArr() {
        Random rand = new Random();
        int array[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        return array;
    }

    /**
     * @param arr
     * @return
     * @throws IOException
     */
    public static int[] babbleSort(int arr[]) throws IOException {
        Logger loger = Logger.getLogger(Homework21.class.getName());
        FileHandler fHandler = new FileHandler("Homework21.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);

        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            loger.info(Arrays.toString(arr));
        }
        return arr;

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}