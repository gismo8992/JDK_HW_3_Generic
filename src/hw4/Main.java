package hw4;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник
 */

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "222-11-333", "Petr", 4);
        Employee employee2 = new Employee(4, "111-10-555", "Ivan", 2);
        Employee employee3 = new Employee(2, "992-41-353", "Petr", 3);
        Employee employee4 = new Employee(3, "222-11-333", "Anna", 10);
        Handbook handbook = new Handbook();
        handbook.addEmployee(employee1);
        handbook.addEmployee(employee2);
        handbook.addEmployee(employee3);
        handbook.addEmployee(employee4);
        System.out.println(handbook.findEmployeeByExperience(4));
        System.out.println(handbook.findEmployeeByServiceNumber(3));
        System.out.println(handbook.findEmployeeByServiceNumber(10));
        System.out.println(handbook.findPhoneNumberByName("Petr"));
    }
}
