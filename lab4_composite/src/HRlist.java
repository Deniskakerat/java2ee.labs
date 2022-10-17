import java.util.ArrayList;

public class HRlist {
    private ArrayList<Employee> workers = new ArrayList<>();

    static HRlist instance = null;

    private HRlist() {
    }

    public static HRlist getInstance() {
        if (instance == null) {
            instance = new HRlist();
        }
        return instance;
    }

    public void addWorkers(Employee emp1,boolean isadded) throws EmployeeRegistryException{
        if(workers.isEmpty()|| isadded){
            workers.add(emp1);
        }else {
            String check_name = emp1.GetStringName();
            String check_surname = emp1.GetStringSurName();
            for (Employee emp : workers) {
                if (emp.CheckEmployee(check_name, check_surname)==true) {
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
