import java.util.LinkedList;

public class Drinks {
    public static void main(String[] args) {
        // LinkedList created
        LinkedList<String> drinksList = new LinkedList<>();
        // Adding elements to the LinkedList
        drinksList.add("Prosecco");
        drinksList.add("White Wine");
        drinksList.add("Red Wine");
        drinksList.add("Rosé");
        drinksList.add("Beer");
        drinksList.add("Cider");
        drinksList.add("Spirits");
        drinksList.add("Non-alcoholic");

        // Target drink to search for
        String target = "Beer";
        // Do the linear search
        boolean available = linearSearch(drinksList, target);

        if (available) {
            System.out.println(target + " is available.");
        } else {
            System.out.println(target + " it not available.");
        }

    }

    // Linear search method
    public static boolean linearSearch(LinkedList<String> list, String target) {
        for (String drink: list) {
            if (drink.equals(target)) {
                return true; // Drink found
            }
        }
        return false; // Drink not found
    }

}
