package pl.jakubkrys.eshop;

public class Shoes extends Product {

    private Producer producer;

    public Shoes(String name, double price, int stock, Producer producer) {
        super(name, price, stock);
        this.producer = producer;
    }

    @Override
    public void display() {
        super.display();
        producer.display();
    }
}
