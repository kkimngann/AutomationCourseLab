package lesson_08;

import java.util.ArrayList;

public class lab_81 {
    public static <List> void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        Staff FT1 = new Staff();
        Staff FT2 = new Staff();
        Staff FT3 = new Staff();
        Contractor C1 = new Contractor();
        Contractor C2 = new Contractor();
        employeeList.add(FT1);
        employeeList.add(FT2);
        employeeList.add(FT3);
        employeeList.add(C1);
        employeeList.add(C2);
        int totalSalary = 0;
        for(Employee e : employeeList){
            totalSalary = totalSalary + e.getSalary();
        }
        System.out.printf("Total salary of all employee: %d", totalSalary );
    }
}
