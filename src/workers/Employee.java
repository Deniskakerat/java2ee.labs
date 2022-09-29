package workers;

public class Employee {
    protected int id;
    protected double salary;
    protected static int nextid = 0;
    protected String name;
    protected String surname;

    public Employee(String name_vvod, String surname_vvod, double sallary) throws FieldLengthLimitException {
        if (name_vvod.length() > 12) {
            throw new FieldLengthLimitException("Name mast be less them 12 symbols");
        } else {
            this.name = name_vvod;
        }

        this.id = nextid++;
        this.surname = surname_vvod;
        this.salary = sallary;
        nextid++;
    }

    public void PrintEmployee() {
        System.out.println("Id of Employee is " +
                id + " Name and Surname is " + name +
                " The surname is " + surname +
                " The salary is " + salary
        );
    }
    public int CheckEmployee(String check_name,String check_surname) {
        if(this.name.equals(check_name) && this.surname.equals(check_surname)){
            return 0;
        }else{
            return 1;
        }
    }
    public String GetStringName() {
        return this.name;
    }
    public String GetStringSurName() {
        return this.surname;
    }
}
