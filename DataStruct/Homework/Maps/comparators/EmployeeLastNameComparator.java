package Homework.Maps.comparators;

import Homework.Maps.entity.Employee;

public class EmployeeLastNameComparator implements java.util.Comparator<Employee> {
    
    @Override
    public int compare(Employee emp1, Employee emp2) {

        return emp1.getLastName().compareTo(emp2.getLastName());
        
    }
    
}
