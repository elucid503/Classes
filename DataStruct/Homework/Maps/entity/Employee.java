package Homework.Maps.entity;

public class Employee {

    public int id;

    public String firstName;
    public String lastName;
    public String title;
    public double salary;

    public Employee(int id, String firstName, String lastName, String title, double salary) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.salary = salary;

    }
    
    // Accessors/Getters 

    public int getId() {
        return id;
    }

    public String getFirstName() {

        return firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public String getTitle() {

        return title;

    }

    public double getSalary() {

        return salary;

    }

    // Mutators/Setters

    public void setId(int id) {

        this.id = id;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public void setSalary(double salary) {

        this.salary = salary;

    }
    
}
