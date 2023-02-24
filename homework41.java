// Дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class homework41 {
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 6, 9, 7, 54, 12);
        System.out.println("Исходный список: " + list);
        List<Integer> reverse = reverseList(list);
        System.out.println("Перевернутый список: " + reverse);
    }
}