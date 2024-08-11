// Abstract

// MainCourse abstract class with variables
public abstract class MainCourse {
    public String name;
    public String ingredients;
    public String allergies;
    public double price; 

// Initiate variables 
    MainCourse(String name, String ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

// Method that prints MainCourse details
    public void getMainCourse() {
        System.out.println(name);
        System.out.println(ingredients);
        System.out.println(price);
    }

// Abstract class for allergies
    public abstract String getAllergies();

}

// Chicken class that extends MainCourse with same variables
class Chicken extends MainCourse {
    Chicken(String name, String ingredients, double price) {
        super(name, ingredients, price);
    }

// Exception handling 
// Override getAllergies() abstract method with allergies information
    @Override
    public String getAllergies() {
        try {
            return "This dish may contain nuts.";
        } catch (Exception e) {
            return "Something went wrong";
        }
        
    }
}

// Tofu class extends MainCourse with same variables
class Tofu extends MainCourse {
    Tofu(String name, String ingredients, double price) {
        super(name, ingredients, price); 
    }
    
// Exception handling
// Override getAllergies() abstract method with allergies information
    @Override
    public String getAllergies() {
        try {
            return "This dish may contain gluten.";
        } catch (Exception e) {
            return "Something went wrong";
        }
        
    }
}

// MainMeal class that calls the Chicken and Tofu classes with information
// Call the abstract class for getAllergies()
class MainMeal {
    public static void main(String[] args) {
        Chicken chickenDish = new Chicken("Roast Chicken", "Chicken, Potatoes, Vegetables and Gravy", 15.50);
        chickenDish.getMainCourse();
        System.out.println(chickenDish.getAllergies());

        Tofu tofuDish = new Tofu("Tofu Noodles","Tofu, Noodles and Vegetables", 14.20);
        tofuDish.getMainCourse();
        System.out.println(tofuDish.getAllergies());
    }
}
