package pl.jakubkrys.eshop;
public class Product {

    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price+" "+"PLN");
        System.out.println("Stock: "+stock+" pcs");
    }
}
