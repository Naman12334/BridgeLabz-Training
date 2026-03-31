// MealPlan interface
interface MealPlan {
    void prepare();
}

// Meal types
class VegetarianMeal implements MealPlan {
    public void prepare() {
        System.out.println("Preparing Vegetarian Meal");
    }
}

class VeganMeal implements MealPlan {
    public void prepare() {
        System.out.println("Preparing Vegan Meal");
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    void generate() {
        plan.prepare();
    }
}

// Generic method
class MealGenerator {
    static <T extends MealPlan> void validateAndGenerate(T meal) {
        meal.prepare();
    }
}

// Main
public class MealDemo {
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        MealGenerator.validateAndGenerate(veg);
    }
}
