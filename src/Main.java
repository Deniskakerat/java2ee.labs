import workers.Employee;
import workers.FieldLengthLimitException;
import workers.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FieldLengthLimitException, EmployeeRegistryException {
        HR_List hr = HR_List.getInstance();
        Scanner scanner = new Scanner(System.in);
        String s, name, surname;
        double sell, man_bonus;

        Employee emp1 = null;
        emp1 = new Employee("John", "Green", 1200);
        emp1.PrintEmployee();
        hr.addWorkers(emp1);
        hr.toStringList();


        System.out.println("Enter name of the employee");
        name = scanner.next();
        System.out.println("Enter surname of employee");
        surname = scanner.next();
        System.out.println("Enter sell of employee");
        s = scanner.next();
        sell = Double.parseDouble(s);

        Employee emp2 = null;
        emp2 = new Employee(name, surname, sell);

        try {
            System.out.println("Checking if you are logged in");
            hr.addWorkers(emp2);
            hr.toStringList();
        }catch (EmployeeRegistryException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Enter name of Manager");
        name = scanner.next();
        System.out.println("Enter surname of Manager");
        surname = scanner.next();
        System.out.println("Enter sell of Manager");
        s = scanner.next();
        sell = Double.parseDouble(s);
        System.out.println("Enter bonus of Manager");
        s = scanner.next();
        man_bonus = Double.parseDouble(s);

        Manager emp3 = null;
        emp3 = new Manager(name, surname, sell,man_bonus);

        try {
            System.out.println("Checking if you are logged in");
            hr.addWorkers(emp3);
            hr.toStringList();
        }catch (EmployeeRegistryException ex) {
            System.out.println(ex.getMessage());
        }

    }
}