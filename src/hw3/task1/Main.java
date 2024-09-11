package hw3.task1;

public class Main {
    /*
1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
Методы должны возвращать результат своей работы.
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