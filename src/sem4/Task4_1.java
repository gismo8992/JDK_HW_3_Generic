package sem4;
/*
Создайте коллекцию мужских и женских имен с помощью интерфейса List
Отсортируйте коллекцию в алфавитном порядке
Отсортируйте коллекциюпо количеству букв в слове
Разверните коллекцию
 */

import java.util.*;

public class Task4_1 {
    List<String> names = new ArrayList<>(Arrays.asList("Сергей", "Иннокентий", "Александр", "Анна"));

    public static void sortByAlphabet(List<String> list) {
        Collections.sort(list);
    }

    public static void sortByLength(List<String> list) {
        list.sort(Comparator.comparing(String::length));
    }
    public static void revers(List<String> list) {
        Collections.reverse(list);
    }
}
