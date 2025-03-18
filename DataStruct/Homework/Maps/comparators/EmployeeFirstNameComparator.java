package Homework.Maps.comparators;

import Homework.Maps.entity.Employee;

public class EmployeeFirstNameComparator implements java.util.Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {

        return emp1.getFirstName().compareTo(emp2.getFirstName());
        
    }
    
}