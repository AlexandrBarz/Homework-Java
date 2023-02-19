// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

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
    randomArray();
}
//     static int[] bubblesSort(int arr[]) throws IOException {
//         Logger loger = Logger.getLogger(Homework21.class.getName());
//         FileHandler fHandler = new FileHandler("Homework21.txt");
//         SimpleFormatter sFormatter = new SimpleFormatter();
//         fHandler.setFormatter(sFormatter);
//         loger.addHandler(fHandler);

//         int temp;
//         for (int i = arr.length - 1; i >= 0; i--) {
//             for (int j = 0; j < arr.length - 1; j++) {
//                 if (arr[j] < arr[j + 1]) {
//                     temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//             loger.info(Arrays.toString(arr));
//         }
//         return arr;
//     }

//     static void print(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int[] inputArray = randomArray();
//         int[] outputArray = bubblesSort(inputArray);
//         print(outputArray);
//     }
// }







// import java.io.IOException;
// import java.util.logging.*;
// public class Homework21 {
// public static void main(String[] args) throws IOException {
// Logger logger = Logger.getLogger(Homework21.class.getName());
// FileHandler fh = new FileHandler("logTask2.xml");
// logger.addHandler(fh);
// XMLFormatter xml = new XMLFormatter();
// fh.setFormatter(xml);
// logger.info("Sort Array");
// int [] array = {2, 5, 1, -7, 3, 64, 0};
// lib.printArrayInt(array);
// int[] newArr = listSort(array);
// System.out.printf("\n Отсортированный массив: \n");
// lib.printArrayInt(newArr);
// }
// public static int[] listSort(int [] arr){
// for(int k = 0; k < arr.length-1; k++) {

// for (int i = 0; i < arr.length - k-1; i++){
// if (arr[i] > arr[i+1]) {
// int temp = arr[i];
// arr[i] = arr[i+1];
// arr[i+1] = temp;
// }
// }
// }
// return arr;
// }

// }