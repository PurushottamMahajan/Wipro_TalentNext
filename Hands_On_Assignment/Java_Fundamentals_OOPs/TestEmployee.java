public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50000.0, 2020, "NI123456");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        emp.setAnnualSalary(55000.0);
        emp.setYearStarted(2021);
        emp.setNationalInsuranceNumber("NI654321");
        System.out.println("\nUpdated Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}