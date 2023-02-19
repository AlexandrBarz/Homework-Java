// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.util.logging.*;

public class Homework21 {

    static int[] randomArray() {
        Random rand = new Random();
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        return array;
    }

    static int[] bubblesSort(int arr[]) throws IOException {
        Logger logger = Logger.getLogger(Homework21.class.getName());
        FileHandler fHandler = new FileHandler("logHW21.txt", true);
        logger.addHandler(fHandler);
        SimpleFormatter sFormat = new SimpleFormatter();
        fHandler.setFormatter(sFormat);;

        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            logger.info(Arrays.toString(arr));
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Исходный массив:");
        int[] inputArray = randomArray();
        System.out.println();
        int[] outputArray = bubblesSort(inputArray);
        System.out.println();
        System.out.println("Отсортированный массив в порядке в порядке убывания:");
        print(outputArray);        
    }
}