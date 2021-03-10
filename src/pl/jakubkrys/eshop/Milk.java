package pl.jakubkrys.eshop;

public class Milk extends Food{

    private double proteinContent;

    public Milk(String name, double price, int stock, String expDate, double proteinContent) {
        super(name, price, stock, expDate);
        this.proteinContent = proteinContent;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Protein content: "+proteinContent+" "+"%");
    }
}
