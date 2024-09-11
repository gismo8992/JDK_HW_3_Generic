package hw4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Handbook {
    private List<Employee> employeeList;

    public Handbook() {
        employeeList = new ArrayList<>();
    }
    public List<Employee> findEmployeeByExperience(int targetExperience) {
        List<Employee> employees = new ArrayList<>();
        for (Employee employee: employeeList) {
            if (employee.getExperience() == targetExperience) {
                employees.add(employee);
            }
        }

        return employees;
    }
    public List<String> findPhoneNumberByName(String targetName) {
        List<String> pHoneNumberList = new ArrayList<>();
        for (Employee employee: employeeList) {
            if(employee.getName().equalsIgnoreCase(targetName)) {
                pHoneNumberList.add(employee.getPhoneNumber());
            }
        }
        return pHoneNumberList;
    }
    public Employee findEmployeeByServiceNumber(int targetServiceNumber) {
        for (Employee employee: employeeList) {
            if (employee.getServiceNumber() == targetServiceNumber) {
                return employee;
            }
        }
        return null; // если не найдем сотрудника
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

}
