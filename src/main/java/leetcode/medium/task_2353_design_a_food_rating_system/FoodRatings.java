package leetcode.medium.task_2353_design_a_food_rating_system;

import java.util.*;

class FoodRatings {

    private final Map<String, Food> foodMap = new HashMap<>();
    private final Map<String, PriorityQueue<Food>> cuisineHighestRatedFoodMap = new HashMap<>();

    public FoodRatings(String[] foods,
                       String[] cuisines,
                       int[] ratings) {
        for (int i = 0; i < cuisines.length; i++) {
            foodMap.put(foods[i], new Food(foods[i], cuisines[i], ratings[i]));
            if (!cuisineHighestRatedFoodMap.containsKey(cuisines[i])) {
                PriorityQueue<Food> queue = new PriorityQueue<>();
                queue.add(new Food(foods[i], cuisines[i], ratings[i]));
                cuisineHighestRatedFoodMap.put(cuisines[i], queue);
            } else {
                var queue = cuisineHighestRatedFoodMap.get(cuisines[i]);
                queue.add(new Food(foods[i], cuisines[i], ratings[i]));
            }
        }
    }

    public void changeRating(String food,
                             int newRating) {
        Food f = foodMap.get(food);
        var queue = cuisineHighestRatedFoodMap.get(f.getCuisine());
        queue.remove(f);
        f.setRating(newRating);
        queue.add(f);
    }

    public String highestRated(String cuisine) {
        return cuisineHighestRatedFoodMap.get(cuisine).peek().getName();
    }
}

class Food implements Comparable<Food> {
    private final String name;
    private final String cuisine;
    private int rating;

    Food(String name,
         String cuisine,
         int rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }




    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Food food = (Food) o;
        return getName().equals(food.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
//        int result = getName().hashCode();
//        result = 31 * result + getCuisine().hashCode();
//        result = 31 * result + getRating();
//        return result;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Food o) {
        int cmp = Integer.compare(o.getRating(), this.getRating());
        return (cmp == 0) ? this.name.compareTo(o.name) : cmp;
    }
}
