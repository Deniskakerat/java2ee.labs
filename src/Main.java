import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MealBuilder MealBuilder = new MealBuilder();
        Scanner scanner = new Scanner(System.in);

        String is_vegan = "";
        System.out.println("Enter yes if you would like to buy vagan burger ");
        is_vegan = scanner.next();

        if (Objects.equals(is_vegan, "yes")) {
            Meal vegMeal = MealBuilder.prepareVegMeal();
            System.out.println("Veg meal");
            vegMeal.showItems();
            System.out.println("Total price is: " + vegMeal.getCost());
        }else{
            Meal normMeal = MealBuilder.prepareChickenMeal();
            System.out.println("Your Meal");
            normMeal.showItems();
            System.out.println("Total price is: " + normMeal.getCost());
        }
    }
}