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

    public void addWorkers(Employee emp1) throws EmployeeRegistryException{
        if(workers.isEmpty()){
            workers.add(emp1);
        }else {
            String check_name = emp1.GetStringName();
            String check_surname = emp1.GetStringSurName();
            for (Employee emp : workers) {
                int s = emp.CheckEmployee(check_name, check_surname);
                if (s == 0) {
                    throw new EmployeeRegistryException("You are already logged in");
                } else {
                    workers.add(emp1);
                }
            }
        }
    }
    public void toStringList() {
        for (Employee emp : workers) {
            emp.PrintEmployee();
        }
    }
}
