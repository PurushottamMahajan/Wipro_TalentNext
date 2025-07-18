import java.util.Scanner;

class Employee {
    int empNo;
    String name;
    String joinDate;
    char desigCode;
    String department;
    int basic;
    int hra;
    int it;

    Employee(int empNo, String name, String joinDate, char desigCode, String department, int basic, int hra, int it) {
        this.empNo = empNo;
        this.name = name;
        this.joinDate = joinDate;
        this.desigCode = desigCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Designation details
        char[] desigCodes = {'e', 'c', 'k', 'r', 'm'};
        String[] designations = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
        int[] da = {20000, 32000, 12000, 15000, 40000};

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Employee No: ");
            int empNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Join Date (dd/mm/yyyy): ");
            String joinDate = sc.nextLine();

            System.out.print("Designation Code (e/c/k/r/m): ");
            char desigCode = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Basic: ");
            int basic = sc.nextInt();

            System.out.print("HRA: ");
            int hra = sc.nextInt();

            System.out.print("IT: ");
            int it = sc.nextInt();
            sc.nextLine();

            employees[i] = new Employee(empNo, name, joinDate, desigCode, department, basic, hra, it);
        }

        System.out.print("\nEnter Employee ID to search: ");
        int empId = sc.nextInt();

        boolean found = false;

        for (Employee emp : employees) {
            if (emp.empNo == empId) {
                found = true;

                String desig = "";
                int empDA = 0;
                for (int i = 0; i < desigCodes.length; i++) {
                    if (emp.desigCode == desigCodes[i]) {
                        desig = designations[i];
                        empDA = da[i];
                        break;
                    }
                }

                int netSalary = emp.basic + emp.hra + empDA - emp.it;

                System.out.println("\n---- Employee Details ----");
                System.out.println("Emp No.: " + emp.empNo);
                System.out.println("Emp Name: " + emp.name);
                System.out.println("Join Date: " + emp.joinDate);
                System.out.println("Designation Code: " + emp.desigCode);
                System.out.println("Department: " + emp.department);
                System.out.println("Basic: " + emp.basic);
                System.out.println("HRA: " + emp.hra);
                System.out.println("IT: " + emp.it);
                System.out.println("Designation: " + desig);
                System.out.println("DA: " + empDA);
                System.out.println("Gross Salary: " + netSalary);
                System.out.println("--------------------------");

                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + empId);
        }

        sc.close();
    }
}
