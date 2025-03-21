package Homework.Maps.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Collections;

import Homework.Maps.comparators.EmployeeIdComparator;
import Homework.Maps.comparators.EmployeeSalaryComparator;
import Homework.Maps.entity.Employee;
import Homework.Maps.util.EmployeeMocker;

public class WhimsicalToysEmployeeReporterImpl implements WhimsicalToysEmployeeReporter {

    List<Employee> employees = EmployeeMocker.listOf8Employees;

    static void printEmployee(Employee employee) {

        System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getTitle() + " " + employee.getSalary());
    
    }
    
    @Override
    public void pickRandomEmployeeAndGiveFreeToy() {

        // shuffle
        
        Collections.shuffle(employees);

        // now since random, first employee is winner

        Employee winner = employees.get(0);

        System.out.print("Free toy given to: "); printEmployee(winner);
        
    }

    @Override
    public void displayEmployeesByUniqueFirstName() {

        // using a set of employees to get unique first names. sets are unique by default

        System.out.print("Unique first names: ");

        Set<String> firstNames = new TreeSet<>();
        employees.forEach(employee -> firstNames.add(employee.getFirstName()));

        firstNames.forEach(firstName -> System.out.print(firstName + ", "));

        System.out.print("\n");

    }

    @Override
    public void countNumberOfEmployeesWithPopularFirstName() {

        // using a map to get the first names and their occurances

        Map<String, Integer> firstNameCount = new TreeMap<>();

        // go thru all employees 

        employees.forEach(employee -> {

            String firstName = employee.getFirstName();

            if (firstNameCount.containsKey(firstName)) {

                // increment the count

                firstNameCount.put(firstName, firstNameCount.get(firstName) + 1);

            } else {

                // start the count 

                firstNameCount.put(firstName, 1);

            }

        });

        // Remove all values == 1 and reverse order to be descending

        firstNameCount.values().removeIf(value -> value == 1);
        
        // printing results
        
        System.out.print("Number of employees with popular first names: ");

        firstNameCount.forEach((firstName, count) -> System.out.print(firstName + ": " + count + ", "));
               
        System.out.print("\n");

    }

    @Override
    public void displayWaitingListForLacrosseTickets() {

        // we will assume that employees with the highest salary are on the waiting list

        // using .reversed() (built into comparator class, useful...) to get the employees
        // with the highest salary first

        Set<Employee> waitingList = new TreeSet<>(new EmployeeSalaryComparator().reversed());
        waitingList.addAll(employees);

        // will only print top 10. a stream can be created, then a limit can be used

        System.out.print("Waiting list for lacrosse tickets: ");

        waitingList.stream().limit(10).forEach(employee -> printEmployee(employee));
        
    }
    
}
