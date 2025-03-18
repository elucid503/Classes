package Homework.Maps.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

import Homework.Maps.comparators.EmployeeIdComparator;

import Homework.Maps.entity.Employee;
import Homework.Maps.util.EmployeeMocker;

public class WhimsicalToysEmployeeReporterImpl implements WhimsicalToysEmployeeReporter {

    List<Employee> employees = EmployeeMocker.listOf8Employees;

    static void printEmployee(Employee employee) {

        System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getTitle() + " " + employee.getSalary());
    
    }
    
    @Override
    public void pickRandomEmployeeAndGiveFreeToy() {

        // using arraylist of employees for this

        int random = (int) Math.random() * employees.size();

        Employee employee = employees.get(random);

        System.out.print("Free toy given to: "); printEmployee(employee);
        
    }

    @Override
    public void displayEmployeesByUniqueFirstName() {

        // using a set of employees to get unique first names. sets are unique by default

        System.out.print("Unique first names: ");

        Set<String> firstNames = employees.stream().map(employee -> employee.getFirstName()).collect(Collectors.toSet());

        firstNames.forEach(firstName -> System.out.print(firstName + ", "));

        System.out.print("\n");

    }

    @Override
    public void countNumberOfEmployeesWithPopularFirstName() {

        // using a map to get the first names and their occurances

        Map<String, Integer> firstNameCount = new HashMap<>();

        employees.forEach(employee -> {

            String firstName = employee.getFirstName();

            if (firstNameCount.containsKey(firstName)) {

                firstNameCount.put(firstName, firstNameCount.get(firstName) + 1);

            } else {

                firstNameCount.put(firstName, 1);

            }

        });

        System.out.print("Popular names and occurances: ");

        firstNameCount.forEach((name, count) -> System.out.print(name + ": " + count + ", "));
       
        System.out.print("\n");

        System.out.print("\n");

    }

    @Override
    public void displayWaitingListForLacrosseTickets() {

        // we can use a queue to put the employees in order of their id

        // found this method in the docs. it will create a linked queue

        Queue<Employee> waitingList = employees.stream().sorted(new EmployeeIdComparator()).collect(Collectors.toCollection(() -> new java.util.LinkedList<>()));

        System.out.print("Waiting list for lacrosse tickets: ");

        waitingList.forEach(employee -> printEmployee(employee));
        
    }
    
}
