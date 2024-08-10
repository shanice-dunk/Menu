// Interface

public interface Desserts {
    public void dessertName();
    public void cost();
    public void allergies();
}

class Cake implements Desserts {
    public void dessertName() {
        System.out.println("Carrot Cake");
    }

    public void cost() {
        System.out.println(5.60);
    }

    public void allergies() {
        System.out.println("This dessert contains nuts.");
    }
}

class IceCream implements Desserts {
    public void dessertName() {
        System.out.println("Vanilla Ice-Cream");
    }

    public void cost() {
        System.out.println(4.50);
    }

    public void allergies() {
        System.out.println("This dessert contains gluten.");
    }
}

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
