package pl.jakubkrys.eshop;

public class Food extends Product{

    private String expDate;

    public Food(String name, double price, int stock, String expDate) {
        super(name, price, stock);
        this.expDate = expDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Best before: "+expDate);
    }
}
