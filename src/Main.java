import workers.Employee;
import workers.FieldLengthLimitException;
import workers.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FieldLengthLimitException {
        HR_List hr = HR_List.getInstance();
        Scanner scanner = new Scanner(System.in);
        String s, name, surname;
        double sell, man_bonus;
        int vvod = 1;

        System.out.println("Enter name of the employee");
        name = scanner.next();
        System.out.println("Enter surname of employee");
        surname = scanner.next();
        System.out.println("Enter sell of employee");
        s = scanner.next();
        sell = Double.parseDouble(s);

        Employee emp1 = null;
        emp1 = new Employee(name, surname, sell);
        emp1.PrintEmployee();

        hr.addWorkers(emp1);
        System.out.println("hr1 code = " + hr.hashCode());
        hr.toStringList();
        HR_List hr2 = HR_List.getInstance();

        System.out.println("Enter name of Manager");
        name = scanner.next();
        System.out.println("Enter surname of Manager");
        surname = scanner.next();
        System.out.println("Enter sell of Manager");
        s = scanner.next();
        sell = Double.parseDouble(s);
        System.out.println("Enter bonus5 of Manager");
        s = scanner.next();
        man_bonus = Double.parseDouble(s);

        Manager emp2 = null;
        emp2 = new Manager(name, surname, sell, man_bonus);
        emp2.PrintEmployee();
        //id,name,surname,sell
        hr2.addWorkers(emp2);
        System.out.println("hr1 code = " + hr2.hashCode());
        hr2.toStringList();
        HR_List hr3 = HR_List.getInstance();
        System.out.println("emp1 = " + emp1.hashCode());
        System.out.println("emp2 = " + emp2.hashCode());

        System.out.println("Adding 3rd workers, and check it");
        Employee emp3 = new Employee("Deck", "Green", 1300);
        emp3.PrintEmployee();

        System.out.println("If you are in this list enter 0");
        hr3.toStringList();
        s = scanner.next();
        vvod = Integer.parseInt(s);

        try {
            hr3.CheckWorker(emp3, vvod);
            System.out.println("Adding you");
            hr3.addWorkers(emp3);
            hr3.toStringList();
        } catch (EmployeeRegistryException ex) {
            System.out.println(ex.getMessage());
        }
        hr3.toStringList();
    }
}