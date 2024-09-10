package task3;

/*
3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
а также переопределение метода toString(), возвращающее строковое представление пары. Работу сдать в виде ссылки на гит репозиторий.
 */
public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("value1", 10);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println(pair1.toString());

        Pair<Double, String> pair2 = new Pair<>(2.21, "value2");
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println(pair2.toString());
    }
}
