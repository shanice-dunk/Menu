// Abstract

public abstract class MainCourse {
    public String name;
    public String ingredients;
    public String allergies;
    public double price; 

    MainCourse(String name, String ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public void getMainCourse() {
        System.out.println(name);
        System.out.println(ingredients);
        System.out.println(price);
    }

    public abstract String getAllergies();

}

class Chicken extends MainCourse {
    Chicken(String name, String ingredients, double price) {
        super(name, ingredients, price);
    }

// Exception handling 
    @Override
    public String getAllergies() {
        try {
            return "This dish may contain nuts.";
        } catch (Exception e) {
            return "Something went wrong";
        }
        
    }
}

class Tofu extends MainCourse {
    Tofu(String name, String ingredients, double price) {
        super(name, ingredients, price); 
    }
    
// Exception handling
    @Override
    public String getAllergies() {
        try {
            return "This dish may contain gluten.";
        } catch (Exception e) {
            return "Something went wrong";
        }
        
    }
}

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
