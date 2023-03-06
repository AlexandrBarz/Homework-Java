import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class homework6 {
   public static void main(String[] args) {
      Laptop laptop1 = new Laptop("Sony", "4", "512", "Windows", "grey");
      Laptop laptop2 = new Laptop("Asus", "4", "256", "Lunex", "black");
      Laptop laptop3 = new Laptop("Asus", "8", "512", "Windows", "black");
      Laptop laptop4 = new Laptop("Apple MacBook Air 13", "8", "256", "MacOs", "grey");
      Laptop laptop5 = new Laptop("Huawei", "16", "512", "Windows", "black");

      Set<Laptop> laptops = new HashSet<>(List.of(laptop1, laptop2,
         laptop3, laptop4, laptop5));

      Map<String, String> sel = (selectCriterion());
      sort(sel, laptops);
   }

   public static String scanner() {
      Scanner scanner = new Scanner(System.in);
      String scan = scanner.nextLine();
      return scan;
   }

   public static Map<String, String> selectCriterion() {
      Map<String, String> resultCriterions = new HashMap<>();
      while (true) {
         System.out.println("Вы хотите выбрать критерии? Если да введите 'Y', если нет введите 'N'");
         String question = scanner();
         if (question.equals("N")) {
            break;
         } else {
            System.out.println(
                  "Введите цифру, соответствующую необходимому критерию: \n 1 - Название \n 2 - ОЗУ \n 3 - Объем ЖД \n 4 - Операционная система \n 5 - Цвет");
            String key = scanner();
            System.out.println("Введите значения для выбранного критерия: ");
            String value = scanner();
            resultCriterions.put(key, value);
         }
      }
      System.out.println(resultCriterions);
      return resultCriterions;
   }

   public static void sort(Map<String, String> criterions, Set<Laptop> laptops) {
      Set<Laptop> temp = new HashSet<>(laptops);
      for (Laptop laptop : laptops) {
         for (Object pair : criterions.keySet()) {
            if (pair.equals("1") && !laptop.getName().equals(criterions.get(pair))) {
               temp.remove(laptop);
            }
            for (Object pair1 : criterions.keySet()) {
               if (pair1.equals("2") && !laptop.getRam().equals(criterions.get(pair1))) {
                  temp.remove(laptop);
               }
               for (Object pair2 : criterions.keySet()) {
                  if (pair2.equals("3") && !laptop.getHardDisk().equals(criterions.get(pair2))) {
                     temp.remove(laptop);
                  }
                  for (Object pair3 : criterions.keySet()) {
                     if (pair3.equals("4") && !laptop.getOperatingSystem().equals(criterions.get(pair3))) {
                        temp.remove(laptop);
                     }
                     for (Object pair4 : criterions.keySet()) {
                        if (pair4.equals("5") && !laptop.getColour().equals(criterions.get(pair4))) {
                           temp.remove(laptop);
                        }
                     }
                  }
               }
            }
         }
      }
      if (temp.isEmpty()) {
         System.out.println("По заданным критериям ничего не найдено!");
      } else {
         System.out.println("Список моделей, которые соответствуют заданным параметрам: \n\n" + temp.toString() + "\n");
      }
   }
}