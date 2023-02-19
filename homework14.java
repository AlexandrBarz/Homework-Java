// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class homework14 {
	
	public static void main(String[] args) {
		Scanner iScanner = new Scanner(System.in);
		System.out.println("Проверка выражения  q + w = e.");
		System.out.println("Введите число q: ");
		int q = iScanner.nextInt();
		System.out.println("Введите число w: ");
		int w = iScanner.nextInt();
        System.out.println("Введите число e: ");
		int e = iScanner.nextInt();
		System.out.printf("%d + %d = %d ", q, w, e);
		if (q + w == e) {
		    System.out.printf("Равенство верное");
		}
		    else {
		        System.out.printf("Уравнение не имеет решения");
		    }
		iScanner.close();
	}
}