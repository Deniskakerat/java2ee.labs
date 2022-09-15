import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s,name,surname;
        int id;
        double sell;

        System.out.println("Enter id of the worker");
        s = scanner.next();
        id = Integer.parseInt(s);
        System.out.println("Enter name of the worker");
        name = scanner.next();
        System.out.println("Enter surname of the worker");
        surname = scanner.next();
        System.out.println("Enter sell of the worker");
        s = scanner.next();
        sell = Double.parseDouble(s);

        //id,name,surname,sell
        try {
            Employee emp1 = new Employee(id, name, surname, sell);
            emp1.PrintEmployee();
        }catch(FieldLengthLimitException ex){
            System.out.println(ex.getMessage());
        } catch (IncorrectSalaryException et) {
            System.out.println(et.getMessage());
        }

    }
}