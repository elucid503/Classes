package Homework.Maps.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Homework.Maps.comparators.EmployeeFirstNameComparator;
import Homework.Maps.comparators.EmployeeIdComparator;
import Homework.Maps.comparators.EmployeeLastNameComparator;
import Homework.Maps.comparators.EmployeeSalaryComparator;
import Homework.Maps.comparators.EmployeeTitleComparator;

import Homework.Maps.entity.Employee;
import Homework.Maps.util.EmployeeMocker;

public class EmployeeReporterImpl implements EmployeeReporter {

    List<Employee> employees = EmployeeMocker.listOf8Employees;

    // each method will sort in ascending order

    static void printEmployee(Employee employee) {
        System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getTitle() + " " + employee.getSalary());
    }

    @Override
    public void displayEmployeesById() {

        System.out.println("Employees sorted by ID: ");

        // using comparator

        Set<Employee> employeeSet = new TreeSet<>(new EmployeeIdComparator());

        employeeSet.addAll(employees);

        employeeSet.forEach(employee -> printEmployee(employee));
        
    }

    @Override
    public void displayEmployeesByFirstName() {

        System.out.println("Employees sorted by first name: ");

        Set<Employee> employeeSet = new TreeSet<>(new EmployeeFirstNameComparator());
        employeeSet.addAll(employees);

        employeeSet.forEach(employee -> printEmployee(employee));
        
    }

    @Override
    public void displayEmployeesByLastName() {

        System.out.println("Employees sorted by last name: ");

        Set<Employee> employeeSet = new TreeSet<>(new EmployeeLastNameComparator());
        employeeSet.addAll(employees);

        employeeSet.forEach(employee -> printEmployee(employee));

    }

    @Override
    public void displayEmployeesByTitle() {

        System.out.println("Employees sorted by title: ");

        Set<Employee> employeeSet = new TreeSet<>(new EmployeeTitleComparator());
        employeeSet.addAll(employees);

        employeeSet.forEach(employee -> printEmployee(employee));

    }

    @Override
    public void displayEmployeesBySalary() {

        System.out.println("Employees sorted by salary: ");

        Set<Employee> employeeSet = new TreeSet<>(new EmployeeSalaryComparator());
        employeeSet.addAll(employees);

        employeeSet.forEach(employee -> printEmployee(employee));

    }

}