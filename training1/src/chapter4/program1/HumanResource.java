package chapter4.program1;

import java.util.Random;

class HumanResource extends Employee {
    public HumanResource(String name) {
        super(name, "人事");
    }

    public void interview(DE company, String candidateName, String department, String language) {
        Random rand = new Random();
        boolean hired = rand.nextBoolean();
        System.out.println("面接を行い、結果は " + (hired ? "採用" : "不採用") + " だった。");

        if (hired) {
            if (department.equals("エンジニア")) {
                company.createEmployee(new Engineer(candidateName, language));
            } else if (department.equals("営業")) {
                company.createEmployee(new Sales(candidateName));
            } else {
                company.createEmployee(new HumanResource(candidateName));
            }
        }
    }

    public void calculateSalary() {
        System.out.println("給与計算を行なった。");
    }
}