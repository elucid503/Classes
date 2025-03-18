package Homework.Maps.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import Homework.Maps.entity.Employee;

import Homework.Maps.services.EmployeeReporter;
import Homework.Maps.services.EmployeeReporterImpl;

import Homework.Maps.services.WhimsicalToysEmployeeReporter;
import Homework.Maps.services.WhimsicalToysEmployeeReporterImpl;
 

public class App {
 	
	public static void main(String[] args){
 		
		EmployeeReporter employeeReporter = new EmployeeReporterImpl();
		WhimsicalToysEmployeeReporter whimsicalToysEmployeeReporter = new WhimsicalToysEmployeeReporterImpl();
 		 
		employeeReporter.displayEmployeesById();
		employeeReporter.displayEmployeesByFirstName();
		employeeReporter.displayEmployeesByLastName();
		employeeReporter.displayEmployeesByTitle();
		employeeReporter.displayEmployeesBySalary();
		
		whimsicalToysEmployeeReporter.pickRandomEmployeeAndGiveFreeToy();
		whimsicalToysEmployeeReporter.displayEmployeesByUniqueFirstName();
		whimsicalToysEmployeeReporter.countNumberOfEmployeesWithPopularFirstName();
		whimsicalToysEmployeeReporter.displayWaitingListForLacrosseTickets();
	
		System.out.println("**** g'day... ****");
	}

}