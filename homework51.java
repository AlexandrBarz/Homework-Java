// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;

public class homework51 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Суров");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Фурсов", List.of("+7(911)123-45-67", "+7(495)759-65-89"));
        phoneBook.put("Суров", List.of("+7(921)569-89-78", "+7(499)459-78-36"));
        phoneBook.put("Табакаов", List.of("+7(905)158-65-78", "+7(812)754-85-75"));
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}