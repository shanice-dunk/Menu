// Inheritance 

// Class called Starters with variables
public class Starters {
    public String name;
    public String ingredients;
    public String allergies;
    public double price; 

// Initiate variables 
    Starters(String name, String ingredients, String allergies, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.allergies = allergies;
        this.price = price;
    }
// Method to print out details of the starters
    public void getStarter() {
        System.out.println(name);
        System.out.println(ingredients);
        System.out.println(allergies);
        System.out.println(price);
    }

}

// Calamari class that extends Starters with same variables
class Calamari extends Starters{
    Calamari(String name, String ingredients, String allergies, double price) {
        super(name, ingredients, allergies, price);
    }

// Override the getStarter() method with information for Calamari class
    @Override
    public void getStarter() {
        System.out.println(name);
        System.out.println("This dish contains: " + ingredients);
        System.out.println("This dish has the following allergies: " + allergies);
        System.out.println(price);
    }

}

// Nachos class that extends Starters with same variables
class Nachos extends Starters{
    Nachos(String name, String ingredients, String allergies, double price) {
        super(name, ingredients, allergies, price);
    }

// Override getStarter() method with information for Nachos class
    @Override
    public void getStarter() {
        System.out.println(name);
        System.out.println("This dish contains: " + ingredients);
        System.out.println("This dish has the following allergies: " + allergies);
        System.out.println(price);
    }
}

// Main method to print Calamari and Nachos classes
class MainStarter {
    public static void main(String[] args) {
        Starters calamari = new Starters("Calamari", "Squid", "Shellfish", 9.50);
        calamari.getStarter();

        Starters nachos = new Starters("Nachos", "Beef", "Gluten", 8.50); 
        nachos.getStarter();
    }
}

