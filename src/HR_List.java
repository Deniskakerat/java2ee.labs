import workers.Employee;

import java.util.ArrayList;

public class HR_List {
    private ArrayList<Employee> workers = new ArrayList<>();

    static HR_List instance = null;

    private HR_List() {
    }

    public static HR_List getInstance() {
        if (instance == null) {
            instance = new HR_List();
        }
        return instance;
    }

    public void addWorkers(Employee emp) {
        workers.add(emp);
    }

    public void CheckWorker(Employee emp, int s) throws EmployeeRegistryException {
        for (int i = 0; i < workers.size(); i++) {
            emp.PrintEmployee();
            if (s == 0) {
                throw new EmployeeRegistryException("You are already logged in");
            } else {
                s = 1;
            }
        }
    }

    public void toStringList() {
        for (Employee emp : workers) {
            emp.PrintEmployee();
        }
    }
}
