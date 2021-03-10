package pl.jakubkrys.eshop;

public class Fruits extends Food{

    private String type;

    public Fruits(String name, double price, int stock, String expDate, String type) {
        super(name, price, stock, expDate);
        this.type = type;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: "+type);
    }
}
