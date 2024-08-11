// Interface

// Create interface Desserts with name, cost and allergies
public interface Desserts {
    public void dessertName();
    public void cost();
    public void allergies();
}

// Create Cake class that implements Desserts
class Cake implements Desserts {
// Create dessertName method and print the name
    public void dessertName() {
        System.out.println("Carrot Cake");
    }

// Create cost() method and print the cost
    public void cost() {
        System.out.println(5.60);
    }
// Create allergies() method and prints String of allergies
    public void allergies() {
        System.out.println("This dessert contains nuts.");
    }
}

// Class IceCream that implements Desserts interface
class IceCream implements Desserts {
// Create dessertName method and print the name
    public void dessertName() {
        System.out.println("Vanilla Ice-Cream");
    }

    public void cost() {
// Create cost() method and print the cost
        System.out.println(4.50);
    }

    public void allergies() {
// Create allergies() method and prints String of allergies
        System.out.println("This dessert contains gluten.");
    }
}

// Main class to print desserts information
class MainDesserts {
    public static void main(String[] args) {
        Cake carroteCake = new Cake();
        carroteCake.dessertName();
        carroteCake.cost();
        carroteCake.allergies();

        IceCream vanillaIceCream = new IceCream();
        vanillaIceCream.dessertName();
        vanillaIceCream.cost();
        vanillaIceCream.allergies();
    }
}
