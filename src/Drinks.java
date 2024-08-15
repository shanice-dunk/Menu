public class Drinks {
    public static int linearSearch(String[] arr, String target) {
        // loop through list to find the drink in the array
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i].equals(target)) {
                System.out.println("This drink is available.");
                return i;
            }
        }
        // Print statement if drink is not available
            System.out.println("This drink is not available.");
            return -1;
    }

    public static void main(String[] args) {
        // Array list of drinks 
        String arr[] = {"Prosecco", "White Wine", "Red Wine", "Rosé", "Beer", "Cider", "Spirits", "Non-alcoholic"};
        // Search for drink
        String target = "White Wine";
        linearSearch(arr, target);
    }

}
