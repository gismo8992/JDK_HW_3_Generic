package sem4;

import java.util.*;

/*
Создайте коллекцию мужских и женских имен с помощью интерфейса List -
добавьте повторяющиеся значения
● Получите уникальный список Set на основании List
● Определите наименьший элемент (алфавитный порядок)
● Определите наибольший элемент (по количеству букв в слове но в обратном
порядке)
● Удалите все элементы содержащие букву ‘A’

 */
public class Task4_2 {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>(Arrays.asList("Сергей", "Иннокентий", "Александр", "Анна", "Светлана", "Сергей", "Анна"));
    }
    public static Set<String> convertListToSet(List<String> list) {
        return new HashSet<>(list);
    }
    public static String minLengthName(Set<String> name) {
        return name.stream().min(Comparator.comparing(String::length)).orElse(null);
    }
    public static String streamReturn(Set<String> name) {
        return null;
    }

}

