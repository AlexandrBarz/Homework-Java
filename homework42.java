// Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.ArrayDeque;
import java.util.Scanner;

public class homework42 {

    public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> linkedList, int element) {
        linkedList.addLast(element);
        return linkedList;
    }

    public static int dequeue(ArrayDeque<Integer> linkedList) {
        int firstElement = linkedList.getFirst();
        linkedList.pollFirst();
        System.out.println("Очередь после удаления элемента: " + linkedList);
        return firstElement;
    }

    public static int first(ArrayDeque<Integer> linkedList) {
        return linkedList.getFirst();
    }

    public static int getRandomNumber() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число, которое хотите добавить: ");
        int n = iScanner.nextInt();
        return n;
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> linkedList = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add((int) (Math.random() * (10 - 1)));
        }
        System.out.println("Очередь: " + linkedList);
        int element = getRandomNumber();
        System.out.println("Очередь после добавления элемента: " + enqueue(linkedList, element));
        System.out.println("Удаляемый элемент: " + dequeue(linkedList));
        System.out.println("Первый элемент: " + first(linkedList));
    }
}