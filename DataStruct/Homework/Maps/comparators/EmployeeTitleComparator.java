package Homework.Maps.comparators;

import Homework.Maps.entity.Employee;

public class EmployeeTitleComparator implements java.util.Comparator<Employee> {
    
    @Override
    public int compare(Employee emp1, Employee emp2) {

        return emp1.getTitle().compareTo(emp2.getTitle());
        
    }
    
}