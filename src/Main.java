import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s,name,surname;
        int id;
        double sell;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id of the worker");
        s = scanner.next();
        id = Integer.parseInt(s);
        System.out.println("Enter name of the worker");
        name = scanner.next();
        System.out.println("Enter surname of the worker");
        surname = scanner.next();
        System.out.println(s);
        System.out.println("Enter sell of the worker");
        s = scanner.next();
        sell = Double.parseDouble(s);
        //id,name,surname,sell
        Employee emp1 = new Employee();
    }
}