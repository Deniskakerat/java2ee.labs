import java.util.ArrayList;

public class Manager extends Employee {
    double bonus;

    public Manager(String name_vvod, String surname_vvod, double sallary, double input_bonus, String dept_vvod) throws FieldLengthLimitException {
        super(name_vvod, surname_vvod, sallary, dept_vvod);

        this.id = nextid++;
        if (name_vvod.length() > 12) {
            throw new FieldLengthLimitException("Name mast be less them 12 symbols");
        }
        this.surname = surname_vvod;
        this.name = name_vvod;
        this.salary = sallary;
        this.bonus = input_bonus;
        this.subordinates = new ArrayList<Employee>();
        this.dept = dept_vvod;
    }
@Override
    public void PrintEmployee() {
        System.out.println("Id of Employee is " +
                id + " Name and Surname is " + name +
                " The surname is " + surname +
                " The salary is " + salary
                + " The bonus is " + bonus
        );

    }

}

