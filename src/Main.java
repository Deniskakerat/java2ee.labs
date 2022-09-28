import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s, name, surname;
        double sell;

        System.out.println("Enter name of the worker");
        name = scanner.next();
        System.out.println("Enter surname of the worker");
        surname = scanner.next();
        System.out.println("Enter sell of the worker");
        s = scanner.next();
        sell = Double.parseDouble(s);

        //id,name,surname,sell


    }
}