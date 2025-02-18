import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto Meal";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High-Protein Meal";
    }
}

class Meal<T extends MealPlan> {
    private List<T> mealOptions = new ArrayList<>();

    public void addMeal(T meal) {
        mealOptions.add(meal);
    }

    public List<T> getMeals() {
        return mealOptions;
    }

    public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
        System.out.println("Generated Meal Plan:");
        for (T meal : meals) {
            System.out.println("- " + meal.getMealType());
        }
    }
}

public class Q4_MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeals = new Meal<>();
        vegetarianMeals.addMeal(new VegetarianMeal());
        vegetarianMeals.addMeal(new VegetarianMeal());

        Meal<VeganMeal> veganMeals = new Meal<>();
        veganMeals.addMeal(new VeganMeal());
        veganMeals.addMeal(new VeganMeal());

        Meal<KetoMeal> ketoMeals = new Meal<>();
        ketoMeals.addMeal(new KetoMeal());

        Meal<HighProteinMeal> highProteinMeals = new Meal<>();
        highProteinMeals.addMeal(new HighProteinMeal());

        System.out.println("Vegetarian Meal Plan:");
        Meal.generateMealPlan(vegetarianMeals.getMeals());

        System.out.println("\nVegan Meal Plan:");
        Meal.generateMealPlan(veganMeals.getMeals());

        System.out.println("\nKeto Meal Plan:");
        Meal.generateMealPlan(ketoMeals.getMeals());

        System.out.println("\nHigh-Protein Meal Plan:");
        Meal.generateMealPlan(highProteinMeals.getMeals());
    }
}
