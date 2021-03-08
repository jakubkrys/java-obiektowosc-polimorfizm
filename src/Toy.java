public class Toy {

    private String name;
    private double price;

    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}
