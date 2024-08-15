public class Drinks {
    public static int linearSearch(String[] arr, String target) {
        // loop through list to find element
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i].equals(target)) {
                System.out.println("This drink is available.");
                return i;
            }
        }
        // Print statement if element is not found
            System.out.println("This drink is not available.");
            return -1;
    }

    public static void main(String[] args) {
        String arr[] = {"Prosecco", "White Wine", "Red Wine", "Rosé", "Beer", "Cider", "Spirits", "Non-alcoholic"};
        String target = "White Wine";
        linearSearch(arr, target);
    }

}
