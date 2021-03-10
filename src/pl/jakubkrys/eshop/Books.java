package pl.jakubkrys.eshop;

public class Books extends Product{

    private Author author;

    public Books(String name, double price, int stock, Author author) {
        super(name, price, stock);
        this.author = author;
    }

    @Override
    public void display() {
        super.display();
        author.display();
    }
}
