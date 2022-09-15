public class Employee {
    private int id;
    private String name;
    private String surname;
    private double salary;
    public Employee(int id_vvod,String name_vvod,String surname_vvod, double sallary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = id_vvod;
        if(name_vvod.length()>12){
            throw new FieldLengthLimitException("Too much symbols in name");
        }else{
            this.name = name_vvod;
        }
        if(surname_vvod.length()>12){
            throw new FieldLengthLimitException("Too much symbols in surname");
        }else{
            this.surname = surname_vvod;
        }if(sallary<0){
            throw new IncorrectSalaryException("The sallary can`t be negative");
        }else{
            this.salary = sallary;
        }


    }
    void PrintEmployee(){
    System.out.println("Id of Employee is "+
            + id +"Name and Surname is " + name + " " + surname +
            " The salary is " + salary
            );
    }
}
