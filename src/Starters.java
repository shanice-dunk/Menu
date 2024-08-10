// Inheritance 
public class Starters {
    public String name;
    public String ingredients;
    public String allergies;
    public double price; 


    Starters(String name, String ingredients, String allergies, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.allergies = allergies;
        this.price = price;
    }

    public void getStarter() {
        System.out.println(name);
        System.out.println(ingredients);
        System.out.println(allergies);
        System.out.println(price);
    }

}

class Calamari extends Starters{
    Calamari(String name, String ingredients, String allergies, double price) {
        super(name, ingredients, allergies, price);
    }

    @Override
    public void getStarter() {
        System.out.println(name);
        System.out.println("This dish contains: " + ingredients);
        System.out.println("This dish has the following allergies: " + allergies);
        System.out.println(price);
    }

}

class Nachos extends Starters{
    Nachos(String name, String ingredients, String allergies, double price) {
        super(name, ingredients, allergies, price);
    }

    @Override
    public void getStarter() {
        System.out.println(name);
        System.out.println("This dish contains: " + ingredients);
        System.out.println("This dish has the following allergies: " + allergies);
        System.out.println(price);
    }
}

class Main {
    public static void main(String[] args) {
        Starters calamari = new Starters("Calamari", "Squid", "Shellfish", 9.50);
        calamari.getStarter();

        Starters nachos = new Starters("Nachos", "Beef", "Gluten", 8.50); 
        nachos.getStarter();
    }
}

