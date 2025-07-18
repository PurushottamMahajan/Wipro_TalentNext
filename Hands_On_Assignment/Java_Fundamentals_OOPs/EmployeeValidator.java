import java.util.Optional;

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

public class EmployeeValidator {
    public static void validateEmployee(Employee emp) throws InvalidEmployeeException {
        Optional<Employee> optEmp = Optional.ofNullable(emp);
        if (optEmp.isEmpty()) {
            throw new InvalidEmployeeException("Employee object is null");
        }
        System.out.println("Employee is valid: " + emp.getName());
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000.0, 2020, "NI123");
        Employee nullEmp = null;

        try {
            validateEmployee(emp);
            validateEmployee(nullEmp);
        } catch (InvalidEmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private int year;
    private String niNumber;

    public Employee(String name, double salary, int year, String niNumber) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.niNumber = niNumber;
    }

    public String getName() {
        return name;
    }
}