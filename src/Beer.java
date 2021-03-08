public class Beer extends Drink{

    private double alcoholStrength;

    public Beer(int capacity, String ingredients, double alcoholStrength) {
        super(capacity, ingredients);
        this.alcoholStrength = alcoholStrength;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Alcohol strength: "+alcoholStrength+" "+"%");
    }
}
