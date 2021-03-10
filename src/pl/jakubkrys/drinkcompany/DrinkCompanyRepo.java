package pl.jakubkrys.drinkcompany;

public class DrinkCompanyRepo {

    Drink[] drinks = new Drink[20];
    private int drinkIndex = 0;

    public void add (Drink drink){
        if(drinkIndex == drinks.length){
            drinkIndex = 0;
        }
        drinks[drinkIndex++] = drink;
    }

    public void displayAll(){
        for (int i = 0; i < drinkIndex; i++) {
            drinks[i].display();
        }
    }
}
