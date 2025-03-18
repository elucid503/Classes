package Homework.Maps.services;

import java.util.List;

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

        // gets stream 
        // sorts by id using our specific id comparator 
        // then prints using our static util method above

        employees.stream().sorted(new EmployeeIdComparator()).forEach(employee -> printEmployee(employee)); // use our util print to show result
        
    }

    @Override
    public void displayEmployeesByFirstName() {

        System.out.println("Employees sorted by first name: ");

        // copy of first but with other comparator

        employees.stream()
            .sorted(new EmployeeFirstNameComparator())
            .forEach(employee -> printEmployee(employee));

    }

    @Override
    public void displayEmployeesByLastName() {

        System.out.println("Employees sorted by last name: ");

        // same thing ... and so on

        employees.stream()
            .sorted(new EmployeeLastNameComparator())
            .forEach(employee -> printEmployee(employee));

    }

    @Override
    public void displayEmployeesByTitle() {

        System.out.println("Employees sorted by title: ");

        employees.stream()
            .sorted(new EmployeeTitleComparator())
            .forEach(employee -> printEmployee(employee));

    }

    @Override
    public void displayEmployeesBySalary() {

        System.out.println("Employees sorted by salary: ");

        employees.stream()
            .sorted(new EmployeeSalaryComparator())
            .forEach(employee -> printEmployee(employee));

    }

}