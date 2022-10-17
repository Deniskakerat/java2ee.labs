import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FieldLengthLimitException, EmployeeRegistryException {
        HRlist hr = HRlist.getInstance();
        Scanner scanner = new Scanner(System.in);
        String s, name, surname;
        double sell, man_bonus;

        Manager head = null;
        head = new Manager("John", "Brown", 1200, 1100, "Head");
        hr.addWorkers(head, true);
        Employee headSales = new Employee("John", "Green", 1000, "HeadSales");
        headSales.setIdmen(head);
        hr.addWorkers(headSales, true);
        Employee headMarketing = new Employee("Daniel", "Ronaldo", 950, "HeadMarketing");
        headMarketing.setIdmen(head);
        hr.addWorkers(headMarketing, true);

        Employee saleEmp1 = new Employee("Ben", "Air", 780, "Sales");
        saleEmp1.setIdmen(headSales);
        hr.addWorkers(saleEmp1, true);
        Employee saleEmp2 = new Employee("Den", "Vantik", 630, "Sales");
        saleEmp2.setIdmen(headSales);
        hr.addWorkers(saleEmp2, true);

        Employee marketEmp1 = new Employee("Cole", "Landy", 680, "Sales");
        marketEmp1.setIdmen(headMarketing);
        hr.addWorkers(marketEmp1, true);
        Employee marketEmp2 = new Employee("Tom", "Cooper", 830, "Sales");
        marketEmp2.setIdmen(headMarketing);
        hr.addWorkers(marketEmp2, true);

        hr.toStringList();

        head.add(headSales);
        head.add(headMarketing);

        headSales.add(saleEmp1);
        headSales.add(saleEmp2);

        headMarketing.add(marketEmp1);
        headMarketing.add(marketEmp2);

        head.PrintEmployee();

        System.out.println("Result : ");
        for (Employee headEmp : head.getSubordinates()) {
            headEmp.PrintEmployee();
            for (Employee employee : headEmp.getSubordinates()) {
                employee.PrintEmployee();
            }
        }
        /*
        Employee emp2 = null;
        emp2 = new Employee(name, surname, sell);
        emp2.setIdmen(emp3);
        try {
            System.out.println("Checking if you are logged in");
            hr.addWorkers(emp2);
            hr.toStringList();
        }catch (EmployeeRegistryException ex) {
            System.out.println(ex.getMessage());
        }*/

    }
}