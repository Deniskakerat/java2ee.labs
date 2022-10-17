import java.util.ArrayList;
import java.util.List;

public class Employee {
    protected int id;
    protected double salary;
    protected static int nextid = 0;
    protected String name;
    protected String surname;
    protected int idmen;
    protected String dept;

    protected List<Employee> subordinates;

    public Employee(String name_vvod, String surname_vvod, double sallary, String dept_vvod) throws FieldLengthLimitException {
        if (name_vvod.length() > 12) {
            throw new FieldLengthLimitException("Name mast be less them 12 symbols");
        } else {
            this.name = name_vvod;
            //this.dept = dept;
            subordinates = new ArrayList<Employee>();
        }
        this.id = nextid++;
        this.surname = surname_vvod;
        this.salary = sallary;
        nextid++;
        this.dept = dept_vvod;
    }
    public Employee(){}

    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e){
        subordinates.remove(e);
    }
    public void setIdmen(Employee m){

        this.idmen = m.GetId();

    }

    public java.util.List<Employee> getSubordinates(){
        return subordinates;
    }

    public void PrintEmployee() {
        System.out.println("Id of Employee is " +
                id + " Name is " + name +
                " The surname is " + surname +
                " The salary is " + salary +
                " the manager id is " + idmen +
                " the dept is " + dept
        );
    }
    public boolean CheckEmployee(String check_name,String check_surname) {
        if(this.name.equals(check_name) && this.surname.equals(check_surname)){
            return true;
        }else{
            return false;
        }
    }
    public String GetStringName() {
        return this.name;
    }
    public String GetStringSurName() {
        return this.surname;
    }
    public int GetId() {
        return this.id;
    }
}
