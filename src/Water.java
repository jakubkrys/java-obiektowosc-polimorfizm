public class Water extends Drink{

    private String type;

    public Water(int capacity, String ingredients, String type) {
        super(capacity, ingredients);
        this.type = type;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: "+type);
    }
}
