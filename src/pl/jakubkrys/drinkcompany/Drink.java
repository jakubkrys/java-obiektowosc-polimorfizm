package pl.jakubkrys.drinkcompany;

public class Drink {

    private int capacity;
    private String ingredients;

    public Drink(int capacity, String ingredients) {
        this.capacity = capacity;
        this.ingredients = ingredients;
    }

    public void display(){
        System.out.println("Capacity: "+capacity+" "+"ml");
        System.out.println("Ingredients: "+ingredients);
    }
}
