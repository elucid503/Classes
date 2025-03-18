package Homework.Maps.comparators;

import Homework.Maps.entity.Employee;

public class EmployeeIdComparator implements java.util.Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {

        return Integer.compare(emp1.getId(), emp2.getId());
        
    }
    
}
