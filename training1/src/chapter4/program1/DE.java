package chapter4.program1;

import java.util.ArrayList;
import java.util.List;

class DE {
    private static final String COMPANY_NAME = "BT/DE";
    private List<Employee> employees = new ArrayList<>();
    private List<String> departments = List.of("人事", "営業", "エンジニア");

    public void createEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getName() + " を採用しました。");
    }

    public void showAllEmployees() {
        System.out.println("=== 全従業員情報 ===");
        for (Employee e : employees) {
            e.displayInfo();
        }
    }
}