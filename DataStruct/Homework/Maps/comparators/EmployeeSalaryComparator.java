package Homework.Maps.comparators;

import Homework.Maps.entity.Employee;

public class EmployeeSalaryComparator implements java.util.Comparator<Employee> {
    
    @Override
    public int compare(Employee emp1, Employee emp2) {

        return Double.compare(emp1.getSalary(), emp2.getSalary());
        
    }
    
}