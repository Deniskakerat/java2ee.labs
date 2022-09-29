package workers;

public class Manager extends Employee {
    double bonus;

    public Manager(String name_vvod, String surname_vvod, double sallary, double input_bonus) throws FieldLengthLimitException {
        super(name_vvod, surname_vvod, sallary);

        this.id = nextid++;
        if (name_vvod.length() > 12) {
            throw new FieldLengthLimitException("Name mast be less them 12 symbols");
        }
        this.surname = surname_vvod;
        this.name = name_vvod;
        this.salary = sallary;
        this.bonus = input_bonus;
    }

    public void PrintEmployee() {
        System.out.println("Id of Employee is " +
                id + " Name and Surname is " + name +
                " The surname is " + surname +
                " The salary is " + salary
                + " The bonus is " + bonus
        );

    }

    }

