public class Main {
    /*
1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
Методы должны возвращать результат своей работы.
2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и
содержать элементы одного типа по парно по индексам.
3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
а также переопределение метода toString(), возвращающее строковое представление пары. Работу сдать в виде ссылки на гит репозиторий.
     */
    public static void main(String[] args) {
        System.out.println(Calculator.sum(2.1, 13));
        System.out.println(Calculator.sum(2, 13));
        System.out.println(Calculator.subtract(10, 4.133));
        System.out.println(Calculator.subtract(10, 4));
        System.out.println(Calculator.divide(10, 5));
        System.out.println(Calculator.divide(10, 4.2));
        System.out.println(Calculator.multiply(7, 3.2));
        System.out.println(Calculator.multiply(7, 2));
    }
}