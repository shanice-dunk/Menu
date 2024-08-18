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
        // Checks whether drink was found prints message
        if (available) {
            System.out.println(target + " is available.");
        } else {
            System.out.println(target + " it not available.");
        }

    }

    // Linear search method iterating through each element in the LinkedList
    public static boolean linearSearch(LinkedList<String> list, String target) {
        for (String drink: list) {
            // Compare each element with the target drink
            if (drink.equals(target)) {
                return true; // Drink found
            }
        }
        return false; // Drink not found
    }

}
